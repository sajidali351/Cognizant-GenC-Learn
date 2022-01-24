package com.cts.springlearn;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	
	@NotNull
	@Size(min=2, max=2, message="Country code should be 2 characters")
	private String code;
	private String name;
	
	public Country(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public Country() {
		LOGGER.debug("Inside Country Constructor");
	}
	public String getCode() {
		LOGGER.debug("Inside getCode");
		return code;
	}
	public void setCode(String code) {
		LOGGER.debug("Inside setCode");
		this.code = code;
	}
	public String getName() {
		LOGGER.debug("Inside getName");
		return name;
	}
	public void setName(String name) {
		LOGGER.debug("Inside setName");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country (code=" + code + ", name=" + name + ")";
	}
	
	
}