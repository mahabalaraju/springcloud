package com.raj.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.raj.IntegrationDemoApplication;

class controllerTest {
controller c;
	@BeforeEach
	public void setup() {
		controller c= new controller();
	}
	@AfterEach 
	public void teardown() {
		controller c=null;
	}
	@Test
	public void testcontrollersuccess() {
		controller c= new controller();
		String request= c.hellp("mahabala");
		assertEquals("hellomahabala", request);
	}
}
