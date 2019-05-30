
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rockitbro{
	
@GetMapping("/wassup")
	public String anu() {
		return "hello anau";
	}
@GetMapping("/nigga")
	public String heyy() {
		return "Swagger Hello World";
	}
	@GetMapping("/heybro")
		public String abhay() {
		return "hello abhay";
	}
	
	



}
