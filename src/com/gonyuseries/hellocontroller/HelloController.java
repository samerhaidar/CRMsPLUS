package com.gonyuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
	protected ModelAndView getAdmissionForm() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}

	@ModelAttribute
	protected void addingCommonObject(Model model1) {
		model1.addAttribute("headerMsg","Lebanese engineering school");
	}
	
	@RequestMapping(value = "CSMSystem/index.html", method = RequestMethod.POST)
	protected ModelAndView submitAdmissionForm(
			@ModelAttribute("student1") Student student1, BindingResult result) {
		
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
}
