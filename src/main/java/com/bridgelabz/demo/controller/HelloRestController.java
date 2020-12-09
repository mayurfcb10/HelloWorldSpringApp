package com.bridgelabz.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

	// curl localhost:8080/ -w "\n"
	@RequestMapping(value = { "", "/", "/home" })
	public String sayHello() {
		return ("Hello from BridgeLabz");
	}
}
