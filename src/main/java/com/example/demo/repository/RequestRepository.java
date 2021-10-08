package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.modal.Request;

public interface RequestRepository extends CrudRepository<Request, Integer>{

}
