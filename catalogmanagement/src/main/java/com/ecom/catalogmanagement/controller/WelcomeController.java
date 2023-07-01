package com.ecom.catalogmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class WelcomeController {
	
	@GetMapping
	public String welcome() {
		return "Hello I am Controller 1 with Task Definition Build 54 > Revision : 12";
	}
}
