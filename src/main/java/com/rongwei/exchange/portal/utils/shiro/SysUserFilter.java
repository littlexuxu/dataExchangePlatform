package com.rongwei.exchange.portal.utils.shiro;

import javax.inject.Inject;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;

import com.ajie.wechat.util.JtConstant;
import com.rongwei.exchange.portal.dao.UserDao;
import com.rongwei.exchange.portal.model.User;

public class SysUserFilter extends PathMatchingFilter {

	@Inject
    private UserDao userDao;

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue)
            throws Exception {

        String username = (String) SecurityUtils.getSubject().getPrincipal();
        User user = userDao.findByUsername(username);
        request.setAttribute(JtConstant.CURRENT_USER, user);
        return true;
    }
}
