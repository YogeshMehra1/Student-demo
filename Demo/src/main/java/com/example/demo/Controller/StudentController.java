package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/get/all")
	public List<Student> getAll() {
		return studentService.getAll();
	}

	@PostMapping("/add")
	public String getAll(@RequestBody Student stud) {
		return studentService.add(stud);
	}
	
	@GetMapping("{studentId}")
	public int getId(int studentId)
	{
		return studentService.getById(studentId);
				
}
}