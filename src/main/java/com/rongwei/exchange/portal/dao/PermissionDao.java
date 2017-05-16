package com.rongwei.exchange.portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rongwei.exchange.portal.model.Permission;


public interface PermissionDao extends JpaRepository<Permission, Long> {

}
