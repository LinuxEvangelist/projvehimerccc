package com.reglamb.projvehimerc.controller2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
//@RequestMapping("/")
public final class MainController2 {
	@Autowired
	protected UserDetailsService userService;
	
//@RequestMapping(value = "/welcome",method = RequestMethod.GET)
//	public ModelAndView printUserLogin(ModelAndView mav) {
// 
//	UserDetails user =
//				 (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//	
//	mav.addObject("user", user);
//    
//	return mav;
//		 
//	}
//@RequestMapping(value = { "/","/spring/", "/spring**" },method = RequestMethod.GET)
@RequestMapping(value = { "/index**" },method = RequestMethod.GET)
public String printWelcome(ModelMap model) {

	model.addAttribute("message", "Spring 3 MVC Hello World");
//	return "flowsjsp/welcome/welcome";
	return "index";
}
@RequestMapping(value = { "/main**" },method = RequestMethod.GET)
public String getMain(ModelMap model) {

	model.addAttribute("message", "Spring 3 MVC Hello World");
//	return "flowsjsp/welcome/welcome";
	return "flowsjsf/main/main";
}
@RequestMapping(value = { "/indexjsp**" },method = RequestMethod.GET)
public String getJsp(ModelMap model) {

	model.addAttribute("message", "Spring 3 MVC Hello World");
//	return "flowsjsp/welcome/welcome";
	return "views/flowjsp/ajax";
}
}