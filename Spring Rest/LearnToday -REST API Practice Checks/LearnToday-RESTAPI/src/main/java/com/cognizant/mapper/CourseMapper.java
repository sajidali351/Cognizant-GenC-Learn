package com.cognizant.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.cognizant.model.Course;

public class CourseMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet resultSet, int i) throws SQLException {
		
		Course course = new Course();
		course.setCourseId(resultSet.getInt("courseid"));
		course.setTitle(resultSet.getString("title"));
		course.setFees(resultSet.getFloat("fees"));
		course.setDescription(resultSet.getString("description"));
		course.setTrainer(resultSet.getString("trainer"));
		course.setStartDate(new Date(resultSet.getDate("startdate").getTime()));
		return course;
	}
	
	
	
}
