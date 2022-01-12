package com.spring.app;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfig {
	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEmpName("Kumar");
		return employee;
	}
	
	@Bean
	public Passport passObj() {
		Passport passport = new Passport();
		passport.setPassNum(12345);
		
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		calendar.add(Calendar.DATE, 90);
		
		Date expirary = calendar.getTime();
		passport.setDateOfIssue(today);
		passport.setDateOfExpiry(expirary);
		
		return passport;
		
		
	}
}
