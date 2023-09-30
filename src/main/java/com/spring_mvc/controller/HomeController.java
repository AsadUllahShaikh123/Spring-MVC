package com.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring_mvc.model.Student;

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
	@RequestMapping("/register")
	public String signUp() {
		return "register";
	}
	@RequestMapping(path="/createUser", method =RequestMethod.POST)
	public String registerUser(@ModelAttribute Student student, @RequestParam("name") String name ) {
		System.out.println(student);
		System.out.println("Name : " + name);
		System.out.println("User Register Method Called");
		return "register";
	}
}
