package com.spring_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring_mvc.model.Student;
import com.spring_mvc.service.StudentService;

@Controller
@ComponentScan(basePackages= {"com.spring_mvc.dao","com.spring_mvc.service"})
public class HomeController {

	@Autowired
	private StudentService service;
	
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
	public String registerUser(@ModelAttribute Student student ,Model m) {
		service.registerStudent(student);
		m.addAttribute("success","Data Added Succesfully");
		return "redirect:/register";
	}
}
