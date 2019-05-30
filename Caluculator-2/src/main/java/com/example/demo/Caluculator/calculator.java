package com.example.demo.Caluculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator{
	@GetMapping("/add")
	public String calci(@RequestParam(value="a", required=false, defaultValue="0")String a,@RequestParam(value="b", required=false, defaultValue="0")String b){ 
	
	int A=Integer.parseInt(a);
	int B=Integer.parseInt(b);
	int z=A+B;
	return String.valueOf(z);
	}
	@GetMapping("/div")
	public String div(@RequestParam(value="c", required=false, defaultValue="0")String c,@RequestParam(value="d", required=false, defaultValue="0")String d){ 
		int C=Integer.parseInt(c);
		int D=Integer.parseInt(d);
		int x = 0;
		try {
		 x=C/D;
		}
		catch(ArithmeticException e)
		{
			return ("division by zero not possible");
		}
		
		return String.valueOf(x);}
		
}




