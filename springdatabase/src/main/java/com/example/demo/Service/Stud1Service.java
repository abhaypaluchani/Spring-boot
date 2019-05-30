package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Stud1Repository;
import com.example.demo.entity.Stud1;

@Service
public class Stud1Service {
	@Autowired
	private Stud1Repository stud1Repository;
	public Stud1 getstud1(int id) {
		return stud1Repository.findById(id);
		
	}

}
