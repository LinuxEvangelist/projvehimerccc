package com.reglamb.projvehimerc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@Autowired
	protected UserDetailsService userService;
	@RequestMapping(value = { "/views" },method = RequestMethod.GET)
	public String getJsp(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "views/index";
	}
}
