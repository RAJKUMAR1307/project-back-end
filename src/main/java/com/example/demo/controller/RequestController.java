package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Request;
import com.example.demo.repository.RequestRepository;

@RestController
@RequestMapping(value="/request")
public class RequestController {

	@Autowired
	private RequestRepository RequestRepo;

	@PostMapping(value="/insert")
	public ResponseEntity<?> insertrequest(@RequestBody final Request r){
		RequestRepo.save(r);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Request sent successfully!");
		
	}	
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllRequests(){
		ArrayList<Request> requests = (ArrayList<Request>) RequestRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(requests);
	}
	
}
