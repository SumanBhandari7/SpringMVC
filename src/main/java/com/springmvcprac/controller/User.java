package com.springmvcprac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class User {
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String getuser() {
		return "user";
		
	}
	
	@RequestMapping(path="/list",method=RequestMethod.GET)
	public String getuserlist() {
		return "list";
		
	}

}
