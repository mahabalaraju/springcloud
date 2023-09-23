package com.raj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.raj.Service.userService;
import com.raj.repository.userDao;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UnitTestingWithFullConextLoadWithMock {
	@Autowired
	userService service;

	@MockBean
	userDao dao;


	@Test
	public void getUserIdTest() {
		when(dao.getUserId("mahabala")).thenReturn("123445mahabala");
		String id = service.getUserIdByUsername("mahabala");
		assertEquals("123445mahabala", id);

	}


}
