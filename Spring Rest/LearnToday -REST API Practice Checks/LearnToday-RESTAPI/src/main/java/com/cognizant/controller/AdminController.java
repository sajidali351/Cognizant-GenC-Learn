package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Course;
import com.cognizant.service.AdminService;

@RestController
@RequestMapping("/api")
public class AdminController {

	@Autowired
	private AdminService courseService;

	@GetMapping("/Admin")
	public ResponseEntity<Object> getAllCourses() {
		return ResponseEntity.ok(courseService.getAllCourses());
	}

	@GetMapping("/Admin/{id}")
	public ResponseEntity<Object> getCourseById(@PathVariable int id) {
		try {
			Course course = courseService.getCourseById(id);
			return new ResponseEntity<Object>(course, HttpStatus.OK);
		}catch(DataAccessException e) {
			return new ResponseEntity<Object>("Searched Data not Found",HttpStatus.NOT_FOUND);
		}
	}
}
