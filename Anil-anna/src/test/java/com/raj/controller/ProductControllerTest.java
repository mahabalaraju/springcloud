package com.raj.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.testcontainers.shaded.com.fasterxml.jackson.core.JsonProcessingException;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import com.raj.Service.Service1;
import com.raj.entity.product;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

	@MockBean
	Service1 ser;

	@Autowired
	MockMvc mockmvc;

	@Test
	void testGetallproducts() {

	}

	@Test
	void testGetbyid() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateproducts() {
		fail("Not yet implemented");
	}

	@Test
	void testDeletebyid() {
		fail("Not yet implemented");
	}

	@Test
	void testSave() throws JsonProcessingException, Exception {
		product product1 = product.builder().name("rpduc").Description("ASDFA").id(1).build();
		when(ser.createProduct(product1)).thenReturn("success");
		mockmvc.perform(post("/products")
				.contentType(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(product1)))
		.andExpect(status().isOk());
	}

}