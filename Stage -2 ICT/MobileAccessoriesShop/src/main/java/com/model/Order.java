package com.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

/**
 * This is a pojo class with required attributes,getters and setters
 * @author 2068574
 *
 */
public class Order {
	
	/**
	 * The customerName variable is annotated with NotBlank annotation so that
	 * customerName cannot be empty or blank.
	 */
	@NotBlank(message = "{error.customerName.blank}")
	private String customerName;
	
	/**
	 * The contactNumber variable is annotated with NotBlank annotation so that
	 * contactNumber cannot be empty or blank.
	 */
	@NotBlank(message = "{error.contactNumber.blank}")
	private String contactNumber;
	private String productName;
	
	/**
	 * The quantity variable is annotated with Positive annotation so that
	 * quantity cannot be negative or blank.
	 */
	@Positive(message = "{error.quantity.negative}")
	private int quantity;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
