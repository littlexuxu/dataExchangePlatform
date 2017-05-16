package com.rongwei.exchange.portal.service.impl;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajie.wechat.util.PageQuery;
import com.rongwei.exchange.portal.dao.BaseDao;
import com.rongwei.exchange.portal.dao.UserDao;
import com.rongwei.exchange.portal.model.Operation;
import com.rongwei.exchange.portal.model.Permission;
import com.rongwei.exchange.portal.model.Resource;
import com.rongwei.exchange.portal.model.Role;
import com.rongwei.exchange.portal.model.User;
import com.rongwei.exchange.portal.service.UserService;
import com.rongwei.exchange.portal.utils.PasswordHelper;
import com.rongwei.exchange.portal.utils.QueryUtils;



@Service
@Transactional
public class UserServiceImp implements UserService {

	@Autowired
    private UserDao userDao;
	
	@Autowired
	private BaseDao baseDao;

    @Inject
    private PasswordHelper passwordHelper;

    @Override
    public User save(User user) {
        // TODO Auto-generated method stub
        passwordHelper.encryptPassword(user);

        return userDao.save(user);
    }

    @Override
    public Set<String> getStringRoles(String username) {
        // TODO Auto-generated method stub

        User user = userDao.findByUsername(username);

        Set<Role> roles = user.getRoles();

        Set<String> stringRoles = new HashSet<>();
        for (Role r : roles) {
            stringRoles.add(r.getRole());
        }

        return stringRoles;
    }

    @Override
    public Set<String> getStringPermissions(String username) {
        // TODO Auto-generated method stub

        User user = userDao.findByUsername(username);

        Set<String> stringPermissions = new HashSet<>();

        for (Role r : user.getRoles()) {
            for (Permission p : r.getPermissions()) {
                Resource res = p.getResource();

                for (Operation o : p.getOperations()) {
                    stringPermissions.add(res.getIdentity() + ":" + o.getOperation());
                }
            }
        }
        return stringPermissions;
    }

	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}

	@Override
	public User findByUsernameAndPassword(String username, String password) {
		return userDao.findByUsernameAndPassword(username, password);
	}


	/**
	 * 获取用户列表
	 * @param queryParam json格式查询参数
	 * @param pagequery 分页参数
	 */
	@Override
	public String getUserList(String queryParam, PageQuery pagequery) throws Exception {
		StringBuffer sql = new StringBuffer("SELECT * FROM sys_user t WHERE 1 = 1 ");
		String hSql = QueryUtils.getSqlByQueryParam(queryParam, sql);
		String users = baseDao.queryListJsonBySql(hSql, pagequery);
		return users;
	}

	/**
	 * 用户总数
	 * @param queryParam json格式查询参数
	 */
	@Override
	public Long getUserCount(String queryParam) {
		StringBuffer baseSql = new StringBuffer("SELECT count(1) FROM sys_user t WHERE 1 = 1 ");
		String sql = QueryUtils.getSqlByQueryParam(queryParam, baseSql);
		return baseDao.getCountBySql(sql);
	}

}
