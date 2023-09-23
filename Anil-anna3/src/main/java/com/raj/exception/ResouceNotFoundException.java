package com.raj.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResouceNotFoundException extends RuntimeException {

	public ResouceNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ResouceNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
