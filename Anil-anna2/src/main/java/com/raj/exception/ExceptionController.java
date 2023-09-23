package com.raj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(NoproductFoundException.class)
	public ResponseEntity<Object> asdf(NoproductFoundException pro){
		exception e =new exception(
				pro.getMessage(),
				pro.getCause(),
			    HttpStatus.NOT_FOUND
				);
		return new ResponseEntity<Object>(e,HttpStatus.NOT_FOUND);
				
	}
	@ExceptionHandler(productnotfoundException.class)
	public ResponseEntity<Object> asdf(productnotfoundException pro){
		exception e =new exception(
				pro.getMessage(),
				pro.getCause(),
			    HttpStatus.NOT_FOUND
				);
		return new ResponseEntity<Object>(e,HttpStatus.NOT_FOUND);
				
	}
}
