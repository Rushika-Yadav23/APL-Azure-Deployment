package com.alp.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeComtroller {
	@GetMapping("/")
	public String welcome() {
		return "Welcome to a Simple Web Application !!!!!!";
	}
}
