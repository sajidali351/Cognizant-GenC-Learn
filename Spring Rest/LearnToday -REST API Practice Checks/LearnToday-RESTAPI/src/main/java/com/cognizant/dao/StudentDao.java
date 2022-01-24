package com.cognizant.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Student;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_STUDENT = "insert into student values(?,?,?);";
	private static final String DELETE_STUDENT = "delete from student where enrollmentid = ?;";

	public boolean insertStudent(Student student) {
		if (jdbcTemplate.update(INSERT_STUDENT, student.getEnrollmentId(), student.getStudentId(),
				student.getCourseId()) != 0) {
			return true;
		}
		return false;
	}

	public boolean deleteStudent(int id) {
		if (jdbcTemplate.update(DELETE_STUDENT, id) != 0) {
			return true;
		}
		return false;
	}

}
