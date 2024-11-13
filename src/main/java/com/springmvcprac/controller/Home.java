package com.springmvcprac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {
	
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getIndexPage() {
		return "index";
	}

	
	@RequestMapping(path="/home",method = RequestMethod.GET)
	public String getAboutPage(Model model) {
		model.addAttribute("name","abc");
		return "home";
	}

}
