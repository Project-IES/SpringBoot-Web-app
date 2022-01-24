package com.ashokit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/demo")
public class DemoController {
	@RequestMapping(value="/index", method=RequestMethod.GET)
	//@RequestMapping(value= {"/","/index","/home"})
	//@GetMapping("/homepage")
	public ModelAndView index() {
		ModelAndView mav=new ModelAndView();
		
		//set the data to model in key-value format
		mav.addObject("msg","Welcome to Spring MVC with Spring Boot");
		 
		//set the logical view name
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public ModelAndView indexes() {
		ModelAndView mav=new ModelAndView();
		
		//set the data to model in key-value format
		mav.addObject("msg","Welcome to Spring MVC with Spring Boot");
		 
		//set the logical view name
		mav.setViewName("index");
		
		return mav;
	}
}
