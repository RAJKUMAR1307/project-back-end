package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
 
	Admin findByUsernameAndPassword(String username, String password);
}
