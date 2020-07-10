package com.boot.demo.Mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fun {

	@GetMapping("/")
	public String sayHello() {
		return "Hello world";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to new page";
	}
	
	@GetMapping("/workout")
	public String workOut() {
		return "Run 5K ";
	}
	
	
	
}
