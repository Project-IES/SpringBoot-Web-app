package com.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/home")
public class HomeController {

	@RequestMapping("/index")
	public String displayHomePage(Model model) {
		model.addAttribute("msg", "This is home page");
		return "homePage";
	}
}