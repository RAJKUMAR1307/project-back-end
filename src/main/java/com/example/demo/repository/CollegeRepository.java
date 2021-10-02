package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.College;


public interface CollegeRepository extends CrudRepository<College, Integer> {
	
}
		
