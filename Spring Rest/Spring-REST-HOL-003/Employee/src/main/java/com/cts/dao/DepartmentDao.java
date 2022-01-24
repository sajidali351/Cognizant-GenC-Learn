package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cts.model.Department;
import com.cts.model.Employee;
@Component
public class DepartmentDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentDao.class);
	private static ArrayList<Department> DEPARTMENT_LIST;
	public DepartmentDao() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		DEPARTMENT_LIST = (ArrayList<Department>) context.getBean("departmentList");

	}
	
	public List<Department> getAllDepartment(){
		return DEPARTMENT_LIST;
	}
}
