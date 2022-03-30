package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
@Repository
public class StudentRepository {
	
public 	List<Student> student=new ArrayList<Student>();
public List<Student> getAll()
{
	
	return student;
}
public String add(Student stud) {
	student.add(stud);
	
	return "added";
}
public int getById(int studentId) {
	return ((StudentRepository) student).getById(studentId);
	
	
}
	

}
