package com.bookstore.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(booknotfoundException.class)
	public ResponseEntity<Object> booknotfoundException(booknotfoundException booknotfoundException){
		bookException e=new bookException(
				booknotfoundException.getMessage(),
				booknotfoundException.getCause(),
				HttpStatus.NOT_FOUND
				);
		return new ResponseEntity<>(e,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(nosuchbookexist.class)
	public ResponseEntity<Object> booknotfoundException(nosuchbookexist booknotfoundException){
		bookException e=new bookException(
				booknotfoundException.getMessage(),
				booknotfoundException.getCause(),
				HttpStatus.NOT_FOUND
				);
		return new ResponseEntity<>(e,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(bookalreadyfound.class)
	public ResponseEntity<Object> booknotfoundException(bookalreadyfound booknotfoundException){
		bookException e=new bookException(
				booknotfoundException.getMessage(),
				booknotfoundException.getCause(),
				HttpStatus.NOT_FOUND
				);
		return new ResponseEntity<>(e,HttpStatus.NOT_FOUND);
	}
}
