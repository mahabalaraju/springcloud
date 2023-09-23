package com.raj;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.raj.Dao.AadharDao;
import com.raj.entityy.Aadhardetails;
import com.raj.service.Aadharservice;

@SpringBootTest
class Anna1ApplicationTests {

	@InjectMocks
	Aadharservice service;

	@Mock
	AadharDao dao;
	Aadhardetails aadhar;


	@BeforeEach
	void asdf() {
	aadhar= new Aadhardetails();
	aadhar.builder().AadharId(121).address("chikkamagalur").age(98).email("xyz").build();
	}
	@Test
	public void getUserIdTest() {
		when(dao.getaadharbyname("mahabala")).thenReturn(new ArrayList<>(Collections.singleton(aadhar)));
		
	assertThat(service.fetchAdharById("mahabala")).isEqualTo(dao.getaadharbyname("mahabala"));

	}

}
