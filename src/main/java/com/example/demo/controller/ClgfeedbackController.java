package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modal.Clgfeedback;
import com.example.demo.repository.ClgfeedbackRepository;


@RestController
@RequestMapping(value="/clgfeedback")
public class ClgfeedbackController {

	@Autowired
	private ClgfeedbackRepository ClgfeedbackRepo;

	@PostMapping(value="/insert")
	public ResponseEntity<?> insertclgfeedback(@RequestBody final Clgfeedback c){
		ClgfeedbackRepo.save(c);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College feedback sent successfully!");
		
	}	
	
	
}
