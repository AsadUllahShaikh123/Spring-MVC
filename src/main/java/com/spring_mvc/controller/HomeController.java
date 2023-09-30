package com.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Asad");
		model.addAttribute("rollNo" , 62);
		return "home";
	}
	@RequestMapping("/login")
	public ModelAndView loginPage() {
		
		ModelAndView model = new ModelAndView();
		
		model.addObject("userName","Asad");
		model.addObject("password","Asad123");
		model.setViewName("login");
		
		return model;
	}
}
