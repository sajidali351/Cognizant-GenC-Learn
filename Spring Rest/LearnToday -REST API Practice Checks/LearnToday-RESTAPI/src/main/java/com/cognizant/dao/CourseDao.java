package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.mapper.CourseMapper;
import com.cognizant.model.Course;


@Repository
public class CourseDao {
	
	private static final String SELECT_ALL_COURSES = "select * from course;";
	private static final String SELECT_ALL_COURSES_ASC = "select * from course order by startdate;";
	private static final String SELECT_COURSE = "select * from course where courseid = ?;";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Course> getAllCourses(){
		return jdbcTemplate.query(SELECT_ALL_COURSES, new CourseMapper());
	}
	
	public Course getCourseById(int id) throws DataAccessException {
		return jdbcTemplate.queryForObject(SELECT_COURSE,  new CourseMapper(), new Object[] {id});
	}
	
	public List<Course> getAllCoursesAsc(){
		return jdbcTemplate.query(SELECT_ALL_COURSES_ASC, new CourseMapper());
	}
}
