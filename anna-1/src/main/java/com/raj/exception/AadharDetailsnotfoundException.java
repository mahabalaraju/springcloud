package com.raj.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class AadharDetailsnotfoundException extends RuntimeException {

	public AadharDetailsnotfoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AadharDetailsnotfoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
