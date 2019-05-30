package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudService;
import com.example.demo.entity.Stud;

@RestController
public class StudController {
	@Autowired
	private StudService studService;
	@RequestMapping("/hello")
	public Iterable<Stud> abhay(){ 
		return studService.getStud();
	}
	@GetMapping("/hello/{id}")
	public Optional<Stud> abhay1(@PathVariable Integer id){
		System.out.println(id);
		return studService.getbyid(id);
		
	}
	@PostMapping("/Insert")
	public void abhay2(@RequestBody Stud stud) {
		studService.insert(stud);
	}
	@DeleteMapping("/Delete/{id}")
	public void abhay3(@PathVariable Integer id) {
		 studService.deleteid(id);
		
	}
	@PutMapping("/Update/{id}")
	public void abhay4(@PathVariable Integer id, @RequestBody Stud stud) {
		studService.updatebyid(id,stud);
	}
	@GetMapping("/stud1/{name}")
	public String abhay5(@PathVariable String name) {
		return studService.getstud1(name);
	}
	

}
