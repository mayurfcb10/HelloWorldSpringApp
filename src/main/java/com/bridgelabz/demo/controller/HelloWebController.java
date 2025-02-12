package com.bridgelabz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
	@GetMapping("/web")
	public String Hello() {
		return "hello";
	}

	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message", "This is a custom message. Hello from Bridgelabz");
		return "message";
	}
}
