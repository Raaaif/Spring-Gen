package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello Familia 41!";
	}
	
@RequestMapping("/ment")

	public String ment() {
		return "Persistência";

	}
	
	public String Semana() {
		return "Aprender Java";
	}

}
