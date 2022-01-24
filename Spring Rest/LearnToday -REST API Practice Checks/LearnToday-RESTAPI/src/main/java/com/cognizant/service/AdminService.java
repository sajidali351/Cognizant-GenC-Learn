package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cognizant.dao.CourseDao;
import com.cognizant.model.Course;

@Service
public class AdminService {

	@Autowired
	private CourseDao courseDao;

	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}

	public Course getCourseById(int id) throws DataAccessException {
		return courseDao.getCourseById(id);
	}


}
