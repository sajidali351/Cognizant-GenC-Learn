package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Employee;
import com.cts.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeedao;

	public List<Employee> getAllEmployees(){
		
		return employeedao.getAllEmployee();
	}
	

	
}
	