package com.spring.ui;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.AddressBook;

public class Driver {
	
	
	public static AddressBook loadAddressBook()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddressBook addressBook = (AddressBook) context.getBean("addressBook");
		

		return addressBook;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temporary address");
		System.out.println("Enter the house name");
		String houseName = sc.next();
		System.out.println("Enter the street");
		String street = sc.next();
		System.out.println("Enter the city");
		String city = sc.next();
		System.out.println("Enter the state");
		String state = sc.next();
		System.out.println("Enter the phone number");
		String phone = sc.next();
		
		AddressBook addressBook = loadAddressBook();
		addressBook.getTempAddress().setHouseName(houseName);
		addressBook.getTempAddress().setStreet(street);
		addressBook.getTempAddress().setCity(city);
		addressBook.getTempAddress().setState(state);
		addressBook.setPhoneNumber(phone);
		
		System.out.println("Temporary address");
		System.out.println("House name:"+ addressBook.getTempAddress().getHouseName());
		System.out.println("Street:" + addressBook.getTempAddress().getStreet());
		System.out.println("City:" + addressBook.getTempAddress().getCity());
		System.out.println("State:" + addressBook.getTempAddress().getState());
		System.out.println("Phone number :" + addressBook.getPhoneNumber());
		
		

	}

}
