package com.service;

import org.springframework.stereotype.Service;

import com.model.Order;

/**
 * The BillService class is configured via annotation as Service
 * @author 2068574
 *
 */
@Service
public class BillService {
	
	/**
	 * The calculateTotalCost method is use to calculate the totalCost on the
	 * basis of each product price.
	 * 
	 *  productName	     Price Details (per product)
	 *  HeadPhone	     Rs.450.0
	 *  TravelAdapter	 Rs.1000.0
	 *  MemoryCard	     Rs.300.0
	 *  PenDrive	     Rs.650.0
	 *  USBCable	     Rs.800.0
	 *  
	 *  If the product is TravelAdapter and quantity is 3 then
	 *	cost = 3*1000.0=3000.0 and add 3% of GST with the total cost,
	 *	totalCost = cost +(cost *3.0)/100.0 = 3000.0+90.0 = 3090.0
	 *
	 * @param order argument of type Order class
	 * @return totalCost 
	 */
	public double calculateTotalCost(Order order) {
		double cost=0.0;
		double totalCost = 0.0;
		int perProductPrice = 0;
		
		if(order.getProductName().equalsIgnoreCase("HeadPhone")) {
			perProductPrice = 450;
		}
		else if(order.getProductName().equalsIgnoreCase("TravelAdapter")) {
			perProductPrice = 1000;
		}
		else if(order.getProductName().equalsIgnoreCase("MemoryCard")) {
			perProductPrice = 300;
		}
		else if(order.getProductName().equalsIgnoreCase("PenDrive")) {
			perProductPrice = 650;
		}
		else if(order.getProductName().equalsIgnoreCase("USBCable")) {
			perProductPrice = 800;
		}
		
		cost = order.getQuantity() * perProductPrice;
		totalCost = cost + ( cost * 3 ) / 100;
		return totalCost;
	}

}
