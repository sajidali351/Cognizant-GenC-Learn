package com.spring.app;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter id");
	int id = sc.nextInt();
	
	System.out.println("Name");
	String name = sc.next();
	System.out.println("Email");
	String email = sc.nextLine();
	System.out.println("Contact");
	long contact = sc.nextLong();
	System.out.println("Membership id");
	int Mid = sc.nextInt();
	System.out.println("Membership type");
	String type = sc.nextLine();
	System.out.println("visit/year");
	int visit = sc.nextInt();
	
	BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	/*Customer customer = factory.getBean("custObj");
	customer.setCustId(id);
	customer.setCustName(name);
	customer.setEmailId(email);
	customer.setContactNo(contact); */
	
	MemberShip ship =(MemberShip) factory.getBean("membership");
	ship.setMembershipId(Mid);
	ship.setMembershipType(type);
	ship.setVisitsPerYear(visit);
	ship.setCustomer(new Customer(id, name, email, contact));
	
}

}
