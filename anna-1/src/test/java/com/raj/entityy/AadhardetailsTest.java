package com.raj.entityy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.raj.Dao.AadharDao;
@SpringBootTest
class AadhardetailsTest {
	@MockBean
	Aadhardetails aadhar;
	AadharDao dao;

	@BeforeEach
	void asdf() {
		ArrayList list= new ArrayList<>();
		 aadhar = new Aadhardetails();
	     aadhar.builder().AadharId(121).address("asdf").age(0).name("asd").email("asdf").mobile_no(23423).build();
	list.add(aadhar);
	}
	@Test
	void testentity() {
    //when( )
	}
	
	
	
	
	
	
	
	
	
}
