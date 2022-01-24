package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Department;
import com.cts.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	@GetMapping("/departments")
	public List<Department> getAllEmployee(){
		return departmentService.getAllDepartments();
	}

}
