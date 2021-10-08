package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modal.Respond;
import com.example.demo.repository.RespondRepository;

@RestController
@RequestMapping(value="/respond")
public class RespondController {
	@Autowired
	private RespondRepository RespondRepo;
	
	@PostMapping(value="/insert")
	public ResponseEntity<?> insertrespond(@RequestBody final Respond rd){
		RespondRepo.save(rd);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Respond sent successfully!");
		
	}	
}
