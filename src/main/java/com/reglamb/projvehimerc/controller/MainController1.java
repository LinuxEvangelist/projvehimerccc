package com.reglamb.projvehimerc.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
// 
//@Controller
//@RequestMapping("/spring")
//public final class MainController {
//	@Autowired
//	protected UserDetailsService userService;
//	
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
//}