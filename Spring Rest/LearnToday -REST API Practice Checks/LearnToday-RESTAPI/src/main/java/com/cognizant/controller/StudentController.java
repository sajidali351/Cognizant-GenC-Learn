package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Student;
import com.cognizant.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/Student")
	public ResponseEntity<Object> getAllCourses() {
		return ResponseEntity.ok(studentService.getAllCourses());
	}

	@PostMapping("/Student")
	public ResponseEntity<Object> postStudent(@RequestBody Student model) {
		try {
			boolean status = studentService.postStudent(model);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/Student/{id}")
	public ResponseEntity<Object> deleteStudentEnrollment(@PathVariable int id) {
		try {
			boolean status = studentService.deleteStudentEnrollment(id);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("No enrollment information found", HttpStatus.NOT_FOUND);
		}
	}

}
