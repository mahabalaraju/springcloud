package com.champion.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exception {

	@ExceptionHandler(personnotfoundexception.class)
	public ResponseEntity<Object> asdf(personnotfoundexception personnotfoundexception){
		erooer a=new erooer(personnotfoundexception.getCause(),
				personnotfoundexception.getMessage(),
				HttpStatus.NOT_FOUND
				);
		return new ResponseEntity<Object>(a,HttpStatus.NOT_FOUND);
	}
}
