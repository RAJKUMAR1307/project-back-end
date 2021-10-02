package com.example.demo.controller;


//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<?> insertcollege(@RequestBody final College s){
//		System.out.println(s.getName()+ " " + s.getAge()+ " " + s.getGender() + " " + s.getQualification() + " " + s.getDob());
		CollegeRepo.save(s);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College Registered successfully!");
		
	}	

	
	
}

