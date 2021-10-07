package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.Faculty;

public interface FacultyRepository extends CrudRepository<Faculty, Integer> {

}
