package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cts.model.Employee;
@Component
public class EmployeeDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);
	private static ArrayList<Employee> EMPLOYEE_LIST;
	public EmployeeDao() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST = (ArrayList<Employee>) context.getBean("employeeList");

	}
	
	public List<Employee> getAllEmployee(){
		return EMPLOYEE_LIST;
	}

}
