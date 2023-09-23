package com.raj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raj.Service.userService;

@SpringBootTest

public class SampleUnitTestWithFullContextLoad {

	@Autowired
	userService service;

	
	@Test
	public void getUserIdTest() {
		String id = service.getUserIdByUsername("mahabala");
		assertEquals("12211mahabala", id);
	}
}
