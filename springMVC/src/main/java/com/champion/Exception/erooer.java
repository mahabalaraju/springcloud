package com.champion.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public class erooer {
	private Throwable cause;
	private String message;
	private HttpStatus httpstatus;
	public erooer(Throwable cause, String message, HttpStatus httpstatus) {
		super();
		this.cause = cause;
		this.message = message;
		this.httpstatus = httpstatus;
	}
}
