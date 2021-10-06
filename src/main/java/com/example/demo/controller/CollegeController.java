package com.example.demo.controller;


import java.util.ArrayList;
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
import com.example.demo.repository.CollegeRepository;


	

@RestController
@RequestMapping(value="/college")
public class CollegeController {
	
	@Autowired
	private CollegeRepository CollegeRepo;

	@PostMapping(value="/insert")
	public ResponseEntity<?> insertcollege(@RequestBody final College c){
//		System.out.println(s.getName()+ " " + s.getAge()+ " " + s.getGender() + " " + s.getQualification() + " " + s.getDob());
		CollegeRepo.save(c);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College Registered successfully!");
		
	}	
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllColleges(){
		ArrayList<College> colleges = (ArrayList<College>) CollegeRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(colleges);
	}
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteCollege(@PathVariable final int id){
		CollegeRepo.deleteById(id);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College deleted Successfully!");
		
	}
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<?> getCollege(@PathVariable final int id){
		College college = CollegeRepo.findById(id).get();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(college);
	}     
	@PostMapping(value="/update")
	public ResponseEntity<?> updateCollege(@RequestBody final College c){
		CollegeRepo.save(c);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Student saved successfully!");
		
	}
	@PostMapping(value = "/user")	
	public ResponseEntity<?> findByUsernameAndPassword(@RequestBody final College clg){
		College college = (College) CollegeRepo.findByUsernameAndPassword(clg.getUsername(), clg.getPassword());
		if(college!=null)
			return ResponseEntity
					.status(HttpStatus.OK)
					.body("login successfully");
		else
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body("login failed");
			
	
	}
}

