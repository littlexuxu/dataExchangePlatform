package com.rongwei.exchange.portal.controller;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rongwei.exchange.portal.model.Permission;
import com.rongwei.exchange.portal.model.Resource;
import com.rongwei.exchange.portal.model.Role;
import com.rongwei.exchange.portal.model.User;
import com.rongwei.exchange.portal.utils.shiro.CurrentUser;

@Controller
public class IndexController {
	
	@RequestMapping(value = { "/index", "/" })
	public ModelAndView IndexPage(@CurrentUser User user) {
		Subject subject = SecurityUtils.getSubject();
		System.out.println(subject.getPrincipal());
		
        Set<Role> roles = user.getRoles();

        Set<Permission> permissions = new HashSet<>();
        for (Role r : roles) {
            permissions.addAll(r.getPermissions());
        }

        Set<Resource> resources = new HashSet<>();
        for (Permission p : permissions) {
            resources.add(p.getResource());
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("menus", resources);
        mv.setViewName("index");

        return mv;
	}
	
	/**
	@RequestMapping(value = "/portal")
	public String portalPage(Model model, HttpServletRequest request) {
		String loginName = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("当前登录人:" + loginName + ";当前登录人密码:" + password);
		User user = new User();
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			String md5Password = new BigInteger(1, md.digest()).toString(16);
			System.out.println("当前登录人:" + loginName + ";当前登录人密码:" + password + ";密码加密后:" + md5Password);
			user = userService.findByUsernameAndPassword(loginName, md5Password);
			System.out.println("数据库密码：" + user.getPassword());
		} catch (NullPointerException ex) {
			System.out.println("登录查询失败，原因：该账号密码无匹配值");
			System.out.println("当前登录人:" + loginName + ";当前登录人密码:" + password);
		} catch (Exception e) {
			System.out.println("登录失败，原因:" + e.getMessage());
		}
		if (user.getId() != null) {
			Set<String> userRoles = userService.getStringRoles(loginName);
			System.out.println("当前登录人角色列表:" + userRoles);
			Set<String> userPermissions = userService.getStringPermissions(loginName);
			System.out.println("当前登录人权限列表:" + userPermissions);
			//SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
			//authorizationInfo.setStringPermissions(stringPermissions);
		}
		return "Index";
	}
	*/

    @RequestMapping(value = "/unauthorized")
    public String unauthorized() {
        return "unauthorized";
    }
	
}
