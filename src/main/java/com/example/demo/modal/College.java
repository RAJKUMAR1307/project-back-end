package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
   private int id;
   private String collegeName;   
   private String username;
   private String password;
   private String collegePhoneNumber;
   private String collegePostalAddress;
   
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCollegePhoneNumber() {
	return collegePhoneNumber;
}
public void setCollegePhoneNumber(String collegePhoneNumber) {
	this.collegePhoneNumber = collegePhoneNumber;
}
public String getCollegePostalAddress() {
	return collegePostalAddress;
}
public void setCollegePostalAddress(String collegePostalAddress) {
	this.collegePostalAddress = collegePostalAddress;
}

}

