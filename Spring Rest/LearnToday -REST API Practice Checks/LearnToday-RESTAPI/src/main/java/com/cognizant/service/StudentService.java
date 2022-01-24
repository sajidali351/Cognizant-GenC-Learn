package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.CourseDao;
import com.cognizant.dao.StudentDao;
import com.cognizant.model.Course;
import com.cognizant.model.Student;

@Service
public class StudentService {

	@Autowired
	private CourseDao courseDao;

	@Autowired
	private StudentDao studentDao;

	public List<Course> getAllCourses() {
		return courseDao.getAllCoursesAsc();
	}

	public boolean postStudent(Student student) {
		return studentDao.insertStudent(student);
	}

	public boolean deleteStudentEnrollment(int id) {
		return studentDao.deleteStudent(id);
	}

}
