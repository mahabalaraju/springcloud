package com.uploaddownload.Exception;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(FileNotFoundException.class)
	public ResponseEntity<Object> sdf(FileNotFoundException file){
		ExceptClass except= new ExceptClass(
				file.getCause(),
				file.getMessage(),
				HttpStatus.CREATED);
		return ResponseEntity.status(HttpStatus.CREATED).body(except);
	}
}
