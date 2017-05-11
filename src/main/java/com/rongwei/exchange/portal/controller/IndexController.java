package com.rongwei.exchange.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping
	public String IndexPage(Model model) {
		model.addAttribute("message", "error");
		return "Index_easyui";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginndexPage(Model model) {
		return "Login";
	}
	
	@RequestMapping(value = "/portal", method = RequestMethod.POST)
	public String portalPage(Model model) {
		return "Index";
	}
}
