package com.cognizant.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cognizant.model.Student;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet resultSet, int i) throws SQLException {
		Student student = new Student();
		student.setEnrollmentId(resultSet.getInt("enrollmentid"));
		student.setStudentId(resultSet.getInt("studentid"));
		student.setCourseId(resultSet.getInt("courseid"));
		return student;
	}

}
