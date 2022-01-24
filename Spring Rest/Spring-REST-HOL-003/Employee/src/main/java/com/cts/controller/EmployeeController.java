package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Employee;
import com.cts.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployees();
	}
	
}
