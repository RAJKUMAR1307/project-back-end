package com.example.demo.controller;




import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modal.Student;
import com.example.demo.repository.StudentRepository;



	

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	private StudentRepository StudentRepo;

	@PostMapping(value="/insert")
	public ResponseEntity<?> insertstudent(@RequestBody final Student s){
		StudentRepo.save(s);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Student Registered successfully!");
		
	}
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllStudents(){
		ArrayList<Student> students = (ArrayList<Student>) StudentRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(students);
	}
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable final int id){
		StudentRepo.deleteById(id);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College deleted Successfully!");
		
	}
	
    
	
}

