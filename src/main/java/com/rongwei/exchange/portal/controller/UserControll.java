package com.rongwei.exchange.portal.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ajie.wechat.util.PageQuery;
import com.rongwei.exchange.portal.service.UserService;

@Controller
@RequestMapping("/user")
public class UserControll {

	private final Log logger = LogFactory.getLog(UserControll.class);

	@Inject
	private UserService userService;
	
	/**
	 * 跳转至用户列表
	 * @return
	 */
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view() {
        return "/user/UserList";
    }

    /**
     * 获取用户信息列表
     * @param request
     * @return
     */
    @RequestMapping(value = "/listUser")
    public @ResponseBody String showUserList(HttpServletRequest request) {
		StringBuffer sb = new StringBuffer("{\"total\":");
		try {
			String queryParam = request.getParameter("params");
			System.out.println("参数：" + queryParam);
			PageQuery pagequery = new PageQuery();
			pagequery.setPageIndex(Integer.valueOf(request.getParameter("page")));
			pagequery.setPageSize(Integer.valueOf(request.getParameter("rows")));
			String SgProjectBases = userService.getUserList(queryParam, pagequery);
			Long total = userService.getUserCount(queryParam);
			sb.append(total).append(",\"rows\":").append(SgProjectBases).append("}");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
    }    

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "/login";
    }
	
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest req, RedirectAttributes ra) {
        String exceptionClassName = (String) req.getAttribute("shiroLoginFailure");
        String error = null;
        if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if (exceptionClassName != null) {
            error = "其他错误：" + exceptionClassName;
        }
        if (error != null) {
            ra.addFlashAttribute("error", error);
            return "redirect:/unauthorized";
        }

        return "redirect:/index";
    }
	
}
