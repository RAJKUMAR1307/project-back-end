package com.example.demo.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.ResponseRepository;


@RestController
@RequestMapping(value="/response")
public class ResponseController {
	@Autowired
	private ResponseRepository ResponseRepo;

	@PostMapping(value="/insert")
	public ResponseEntity<?> insertresponse(@RequestBody final Response r){
		ResponseRepo.save(r);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Response sent successfully!");
		
	}	
}
