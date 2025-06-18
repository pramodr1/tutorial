package com.prm.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/spring") // <== This is the base path ===
public class HomeController { 
	
	@RequestMapping("/test")
	public String testMethod(@SessionAttribute String name) {
		return name;
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String testMethod2() {
		return "hello";
	}

}
