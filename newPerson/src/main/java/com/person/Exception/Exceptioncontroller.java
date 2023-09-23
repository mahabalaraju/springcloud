package com.person.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exceptioncontroller {
      @ExceptionHandler(personnotfoundException.class)
	public ResponseEntity<Object> atasdf(personnotfoundException a){
    	  responsebuilder res=new responsebuilder(
    			  a.getCause(),
    			  a.getMessage(),
    			  HttpStatus.NOT_FOUND
    			  );
    	  return new ResponseEntity<Object>(res,HttpStatus.NOT_FOUND);
      }
}
