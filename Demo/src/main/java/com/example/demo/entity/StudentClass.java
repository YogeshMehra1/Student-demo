package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentClass {
	@Id
	private int ClassId;
	private String Class_Name;
	private int year;
	@OneToOne(mappedBy = "studentclass")
	private Student student;
	
	public int getClassId() {
		return ClassId;
	}
	public void setClassId(int classId) {
		ClassId = classId;
	}
	public StudentClass() {
		super();
		
	}
	public String getClass_Name() {
		return Class_Name;
	}
	public void setClass_Name(String class_Name) {
		Class_Name = class_Name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public StudentClass(int classId, String class_Name, int year) {
		super();
		ClassId = classId;
		Class_Name = class_Name;
		this.year = year;
	}
	

} 
