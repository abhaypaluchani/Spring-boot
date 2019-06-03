package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloworld {
	
	@GetMapping("/hey")
	public String hello(){
		return "hey you";
	}

}
