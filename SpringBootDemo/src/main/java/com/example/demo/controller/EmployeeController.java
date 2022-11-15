package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

// EmployeeController we need write .........Controller,because it is standard practice 

//we are designing the REST API,REstful web service

@RestController
// by Using this annotation we telling spring boot that we have design REST API in this class 
public class EmployeeController {

	// Design a method which return a string
	@GetMapping("/GetTest") // in this "/" is compulsory we can take any name   
	public String getData() {
		return "Employee data";
		
	}
	
	// Design a method which Return a list Student Name
	@GetMapping("/getStudentList")
	public List<String> getStudentListDetails(){
		List<String> list=new ArrayList<String>();
		
		list.add("ram");
		list.add("ganesh");
		
		return list;
		
	}
	
	// Design a method which return emloyee object
	@GetMapping("/employeedetails")
	public Employee GetEmployee() {
		Employee employee=new Employee();
		return employee;
		
		
	}

}
 