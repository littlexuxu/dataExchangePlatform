package com.rongwei.exchange.portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.rongwei.exchange.portal.model.User;


public interface UserDao extends JpaRepository<User, Long> , JpaSpecificationExecutor<User> {

    User findByUsername(String username);
    
    User findByUsernameAndPassword(String username, String password);
    
}
