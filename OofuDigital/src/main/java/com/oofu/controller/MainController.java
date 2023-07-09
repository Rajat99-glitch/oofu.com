package com.oofu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/oofu")
public class MainController {

	@GetMapping("/home")
	public String homepage() {
		System.out.println("This is homepage");
		return "homepage";
	}
	
	@GetMapping("/contact")
	public String contact() {
		System.out.println("THis is contact page");
		return "contact";
	}
	
}
