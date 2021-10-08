package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stufeedback {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
   private int id;  
   private String studentName;
   private String feedback;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
}
