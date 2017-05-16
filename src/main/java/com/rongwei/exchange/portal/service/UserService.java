package com.rongwei.exchange.portal.service;

import java.util.Set;

import com.ajie.wechat.util.PageQuery;
import com.rongwei.exchange.portal.model.User;


public interface UserService {
	
	User findByUsernameAndPassword(String username, String password);
	
	User findByUsername(String username);
	
    User save(User user);

    Set<String> getStringRoles(String username);

    Set<String> getStringPermissions(String username);
    
    String getUserList(String queryParam, PageQuery pagequery) throws Exception;
    
    Long getUserCount(String queryParam);

}
