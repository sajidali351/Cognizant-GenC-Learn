package com.cts.springlearn.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;

public class ExceptionResponse {
	private Date timestamp;
	private HttpStatus status;

	private String message;
	private String details;

	public ExceptionResponse(Date timestamp, HttpStatus status, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.status = status;

		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}