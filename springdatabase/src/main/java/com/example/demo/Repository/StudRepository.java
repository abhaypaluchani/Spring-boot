package com.example.demo.Repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Stud;
import com.example.demo.entity.Stud1;



public interface StudRepository extends CrudRepository<Stud,Integer>{

	public Stud findByname(String name);

}


