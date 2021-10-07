package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.College;
import com.example.demo.modal.Faculty;
import com.example.demo.repository.FacultyRepository;


@RestController
@RequestMapping(value="/faculty")
public class FacultyController {

	@Autowired
	private FacultyRepository FacultyRepo;
	
	@PostMapping(value="/insert")
	public ResponseEntity<?> insertfaculty(@RequestBody final Faculty f){
		FacultyRepo.save(f);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Faculty registered successfully!");
		
	}	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<?> getFaculty(@PathVariable final int id){
		Faculty faculty = FacultyRepo.findById(id).get();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(faculty);
	}     
	@PostMapping(value="/update")
	public ResponseEntity<?> updateFaculty(@RequestBody final Faculty f){
		FacultyRepo.save(f);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Faculty saved successfully!");
		
	}
}
