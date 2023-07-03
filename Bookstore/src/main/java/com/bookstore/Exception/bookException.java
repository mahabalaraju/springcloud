package com.bookstore.Exception;

import org.springframework.http.HttpStatus;

public class bookException {

	private String message;
	private Throwable cause;
	private HttpStatus httpstatus;
	public bookException(String message, Throwable cause, HttpStatus httpstatus) {
		super();
		this.message = message;
		this.cause = cause;
		this.httpstatus = httpstatus;
	}
	
}
