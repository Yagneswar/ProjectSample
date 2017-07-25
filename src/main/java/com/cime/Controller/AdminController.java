package com.cime.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@RequestMapping(value = { "/index", "/" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("Hi!!", "My E-Commerce Website");
		return mv;
	}
	// Mapping for aboutus page

	@RequestMapping(value = { "/aboutus" })
	public ModelAndView aboutus() {
		ModelAndView mv = new ModelAndView("aboutus");
		mv.addObject("Hi!!", "My E-Commerce Website");
		return mv;
	}

}
