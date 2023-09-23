package com.uploaddownload.Exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptClass {

	private Throwable cause;
	private String message;
	private HttpStatus httpstatus;
}
