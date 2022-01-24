package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Department;

import com.cts.dao.DepartmentDao;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao department;
	public List<Department> getAllDepartments() {
		
		return department.getAllDepartment();
	}

	
}