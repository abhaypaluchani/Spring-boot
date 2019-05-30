package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stud1 database table.
 * 
 */
@Entity
@NamedQuery(name="Stud1.findAll", query="SELECT s FROM Stud1 s")
public class Stud1 implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int age;

	@Id
	private int id;

	private String place;

	public Stud1() {
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}