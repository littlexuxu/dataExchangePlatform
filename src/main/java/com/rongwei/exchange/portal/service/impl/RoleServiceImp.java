package com.rongwei.exchange.portal.service.impl;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rongwei.exchange.portal.dao.OperationDao;
import com.rongwei.exchange.portal.dao.PermissionDao;
import com.rongwei.exchange.portal.dao.ResourceDao;
import com.rongwei.exchange.portal.dao.RoleDao;
import com.rongwei.exchange.portal.model.Operation;
import com.rongwei.exchange.portal.model.Permission;
import com.rongwei.exchange.portal.model.Resource;
import com.rongwei.exchange.portal.model.Role;
import com.rongwei.exchange.portal.service.RoleService;



@Service
public class RoleServiceImp implements RoleService {
    @Inject
    private RoleDao roleDao;

    @Inject
    private ResourceDao resourceDao;

    @Inject
    private OperationDao operationDao;

    @Inject
    private PermissionDao permissionDao;

    @Override
    public boolean authorise(Long roleId, Long resourceId, List<Long> operationIds) {
        // TODO Auto-generated method stub

        Role r = roleDao.findOne(roleId);

        if (r == null)
            return false;

        Resource resource = resourceDao.findOne(resourceId);
        List<Operation> operations = operationDao.findAll(operationIds);

        Set<Permission> hasPerms = r.getPermissions();

        Permission permission = null;
        for (Permission p : hasPerms) {
            if (p.getResource().equals(resource)) {
                permission = p;
                break;
            }

        }

        if (permission == null) {
            permission = new Permission();
            permission.setResource(resource);
            permission.getOperations().addAll(operations);
            // permission = permissionDao.save(permission);
            r.getPermissions().add(permission);
            roleDao.save(r);
        } else {
            permission.getOperations().addAll(operations);
            permissionDao.save(permission);
        }
        return true;
    }

}
