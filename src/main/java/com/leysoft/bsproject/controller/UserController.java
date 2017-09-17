package com.leysoft.bsproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping(value = "/user")
	public String userView() {
		return "user";
	}
	
	@RequestMapping(value = "/admin")
	public String adminView() {
		return "admin";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
}
