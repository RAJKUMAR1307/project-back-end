package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;
import com.example.demo.modal.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	Student findByUsernameAndPassword(String username, String password);

}
