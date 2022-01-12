package com.app.driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.DBConfig;
import com.spring.app.EmployeeDAO;

public class Main {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO dao = factory.getBean(EmployeeDAO.class);
		
		DBConfig dbConfig = dao.getDbConfig();
		System.out.println(dbConfig.getDriverName());
		System.out.println(dbConfig.getUrl());
		System.out.println(dbConfig.getUserName());
		System.out.println(dbConfig.getPassword());
		
 
 
 
		
	}
}