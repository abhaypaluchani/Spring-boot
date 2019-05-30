package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Stud1;

public interface Stud1Repository extends CrudRepository<Stud1,Integer>{
	public Stud1 findById(int id);

	

}
