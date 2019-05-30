package com.example.demo.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
	@GetMapping("/hello")
	public String hello() {
		return "hello harsha";
	}
	@GetMapping("/add")
	public int add() {
		int a=10,b=20;
		int c=a+b;
		return c;
	}
	@GetMapping("/sub")
	public int sub() {
		int a=100,b=50;
		int c=a-b;
		return c;
	}
	@GetMapping("/div")
	public float div() {
		float a=2.0f,b=2.3f;
		float c=a/b;
		return c;
	}

}
