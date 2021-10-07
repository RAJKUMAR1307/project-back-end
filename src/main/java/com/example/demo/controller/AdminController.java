package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modal.Admin;
import com.example.demo.repository.AdminRepository;;




@RestController
@RequestMapping(value="/admin")
public class AdminController {
	
	@Autowired
	private AdminRepository AdminRepo;
	
	@PostMapping(value = "/user")	
	public ResponseEntity<?> findByUsernameAndPassword(@RequestBody final Admin check){
		Admin admin = (Admin) AdminRepo.findByUsernameAndPassword(check.getUsername(), check.getPassword());
		if(admin!=null)
			return ResponseEntity
					.status(HttpStatus.OK)
					.body("login successfully");
		else
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body("login failed");
			
	
	}
}