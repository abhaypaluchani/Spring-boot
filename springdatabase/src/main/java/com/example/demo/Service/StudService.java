package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Stud1Repository;
import com.example.demo.Repository.StudRepository;
import com.example.demo.entity.Stud;
import com.example.demo.entity.Stud1;

@Service
public class StudService {
	@Autowired
	private StudRepository studRepository;
	@Autowired
	private Stud1Repository stud1Repository;
	public Iterable<Stud> getStud(){
		return studRepository.findAll();
}
	public Optional<Stud> getbyid(Integer id) {
		return studRepository.findById( id);
	}
	public void insert(Stud stud ) {
		studRepository.save(stud);
		
	}
	public void deleteid(Integer id) {
		 studRepository.deleteById(id);
	}
	public void updatebyid(Integer id,Stud stud) {
		studRepository.save(stud);

	}
	public String getstud1(String name) {
		Stud stud =studRepository.findByname(name);
		Stud1 stud1= stud1Repository.findById(stud.getId());
		return name+" lives in "+ stud1.getPlace();
		
	}
}
