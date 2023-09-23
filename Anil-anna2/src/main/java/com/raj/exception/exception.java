package com.raj.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class exception {

	private String message;
	private Throwable cause;
	private HttpStatus httpstatus;
	
}
