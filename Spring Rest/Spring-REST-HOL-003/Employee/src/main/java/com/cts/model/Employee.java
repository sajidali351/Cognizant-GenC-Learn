package com.cts.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String permanent;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
	private Date DateOfBirth;
	private Department department;
	private Skill skill;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, String permanent, Date dateOfBirth, Department department,
			Skill skill) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.permanent = permanent;
		DateOfBirth = dateOfBirth;
		this.department = department;
		this.skill = skill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPermanent() {
		return permanent;
	}

	public void setPermanent(String permanent) {
		this.permanent = permanent;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) throws ParseException {
		
		DateOfBirth = dateOfBirth;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", DateOfBirth=" + DateOfBirth + ", department=" + department + ", skill=" + skill + "]";
	}

	
	
	
}
