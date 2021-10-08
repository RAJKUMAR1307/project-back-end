package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modal.Stufeedback;
import com.example.demo.repository.StufeedbackRepository;

@RestController
@RequestMapping(value="/stufeedback")
public class StufeedbackController {

	
	@Autowired
	private StufeedbackRepository StufeedbackRepo;

	@PostMapping(value="/insert")
	public ResponseEntity<?> insertstufeedback(@RequestBody final Stufeedback s){
		StufeedbackRepo.save(s);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College feedback sent successfully!");
		
	}	
}
