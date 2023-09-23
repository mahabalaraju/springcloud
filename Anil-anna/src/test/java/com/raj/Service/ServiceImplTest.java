package com.raj.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.raj.Repository.productRepository;
import com.raj.entity.product;

@SpringBootTest
class ServiceImplTest {

	@Autowired
	private ServiceImpl ser;
	
	@MockBean
	private productRepository repo;
	
	@BeforeEach
	void setUp() throws Exception {
	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCreateProduct() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateProduct() {
		fail("Not yet implemented");
	}

	@Test
	void testGetallproducts() {
//when(repo.findAll()).thenReturn(Stream.of(new product()))
	}

	@Test
	void testGetproductByid() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteProduct() {
		fail("Not yet implemented");
	}

}
