package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {
	@Id
	private int dep_Id;
	private String dep_name;
	@OneToOne(mappedBy ="department" )
	private Student student;
	public Department() {
		super();
		
	}
	public Department(int dep_Id, String dep_name) {
		super();
		this.dep_Id = dep_Id;
		this.dep_name = dep_name;
	}
	public int getDep_Id() {
		return dep_Id;
	}
	public void setDep_Id(int dep_Id) {
		this.dep_Id = dep_Id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	
	

}
