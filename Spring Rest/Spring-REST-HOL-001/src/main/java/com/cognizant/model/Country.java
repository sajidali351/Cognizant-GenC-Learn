package com.cognizant.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

	private String code;
	private String name;
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

	public Country() {
		
		LOGGER.debug("Inside Country Constructor");
	}

	public Country(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

}
