package com.cognizant.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CountryNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CountryNotFoundException(String message) {
		super(message);
	}

}
