package com.raj.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.raj.Dao.AadharDao;
import com.raj.entityy.Aadhardetails;

@SpringBootTest
class AadharserviceTest {
	@Autowired
	Aadharservice service;

	@MockBean
	AadharDao dao;
	Aadhardetails entity;
	
	@BeforeEach
	void testservice() {
	Aadhardetails	entity=new Aadhardetails();
		 entity.builder().AadharId(121).address("thegur")
		.age(26).email("mahabalaraj4@gmail.com").mobile_no(8884730494d).
		name("mahabala").build();
	}

	@Test
	public void getUserIdTest() {
		when(dao.getaadharbyname("mahabala")).thenReturn(entity);
	
		assertThat(service.fetchAdharById("mahabala")).isEqualTo(dao);
		

	}

}
