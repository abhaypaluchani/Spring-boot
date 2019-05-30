package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@NamedQuery(name="Stud.findAll", query="SELECT s FROM Stud s")
public class Stud implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	private String sex;

	public Stud() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}