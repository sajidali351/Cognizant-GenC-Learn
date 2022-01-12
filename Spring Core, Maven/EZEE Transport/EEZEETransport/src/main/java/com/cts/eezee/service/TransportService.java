package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;

public class TransportService {
	
	@Autowired
	private Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	public void registerBooking(Booking booking) throws ParseException {
		
		
		// code here
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Customer Name");
		String customerName = sc.next();
		
		System.out.println("Enter the Mobile Number");
		Long mobileNumber = sc.nextLong();
		
		System.out.println("Enter the Destination");
		String destination = sc.next();
		
		System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
		Date dateOfJourney = dateFormat.parse(sc.next());
		
		booking.setCustomerName(customerName);
		booking.setMobileNumber(mobileNumber);
		booking.setDestination(destination);
		booking.setDateOfJourney(dateOfJourney);
		
		calculateTravelCost(vehicle.getSource(), destination, dateOfJourney);		
		
		
	}
	public void calculateTravelCost(String source, String destination, Date doj) {

		// code here
		String output = checkAvailableDateForTravel(doj) ? "Total Travel Cost is Rs. " + getCost(destination)
								: "Invalid Travel Date";
		System.out.println(output);
		
		
	
	}
	
	public boolean checkAvailableDateForTravel(Date doj) {
		
		
		// code here
		Date today = new Date();
		String todayStr = dateFormat.format(today);
		String dojStr = dateFormat.format(doj);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		calendar.add(Calendar.DATE, 1);
		
		Date tomorrow = calendar.getTime();
		String tomorrowStr = dateFormat.format(tomorrow);
		
		return dojStr.equals(todayStr) || dojStr.equals(tomorrowStr);
		
	}
	
	public double getCost(String destination) {
		
		// code here
		Map<String, Double> destinatinMap = vehicle.getDestinationMap();

		return destinatinMap.containsKey(destination) ? destinatinMap.get(destination) : 0.0;
	}


}
