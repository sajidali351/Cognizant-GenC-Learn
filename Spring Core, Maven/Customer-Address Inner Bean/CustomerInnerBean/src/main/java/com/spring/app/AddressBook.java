package com.spring.app;

public class AddressBook {
	
	private String phoneNumber;
	private Address tempAddress;
	
	public AddressBook(Address tempAddress) {
		super();
		this.tempAddress = tempAddress;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getTempAddress() {
		return tempAddress;
	}
	public void setTempAddress(Address tempAddress) {
		this.tempAddress = tempAddress;
	}



}
