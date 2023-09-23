package com.raj.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import java.awt.PageAttributes.MediaType;
import org.springframework.http.MediaType;
import java.math.BigDecimal;
import java.util.List;

import javax.net.ssl.SSLEngineResult.Status;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.raj.Service.productService;
import com.raj.Service.serviceImpl;
import com.raj.entity.product;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

   @Autowired
   MockMvc mockmvc;
   
   @MockBean
   productService ser;
   product product1;
   product product2;
   List<product> productlist;
	
	
//	@BeforeEach
//	void setUp() throws Exception {
//		new product();
//		product1=product.builder().name("product1")
//				.Description("description1").id(1).price(new BigDecimal(121)).build();
//		
//		new product();
//		product2=product.builder().name("product2")
//				.Description("description2").id(2).price(new BigDecimal(122)).build();	;
//		productlist.add(product1);
//		productlist.add(product2);
//	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetallproducts() throws Exception {
	when(ser.getallproducts()).thenReturn(productlist);
	this.mockmvc.perform(get("/products")).andDo(print()).andExpect(status().isOk());
	}

	

	@Test
	void testGetbyid() throws Exception {
		when(ser.getproductByid(1)).thenReturn(product1);
		this.mockmvc.perform(get("/products/1")).andDo(print())
		.andExpect(status().isOk());
	}

	@Test
	void testUpdateproducts() throws Exception {
		ObjectMapper mapper= new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter writer=mapper.writer().withDefaultPrettyPrinter();
		 String requestJson=writer.writeValueAsString(product1);
		
		when(ser.createProduct(product1)).thenReturn("success");
		this.mockmvc.perform(put("/products")
		.contentType(MediaType.APPLICATION_JSON)
		.content(requestJson))
		.andDo(print()).andExpect(status().isOk());
	
	}

	@Test
	void testDeletebyid() throws Exception {
	when(ser.deleteProduct(1)).thenReturn("success");
	this.mockmvc.perform(delete("/products/1")).andDo(print())
	.andExpect(status().isOk());
	}

	@Test
	void testSave() throws Exception {
		ObjectMapper mapper= new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter writer=mapper.writer().withDefaultPrettyPrinter();
		 String requestJson=writer.writeValueAsString(product1);
		
		when(ser.createProduct(product1)).thenReturn("success");
		this.mockmvc.perform(post("/products")
		.contentType(MediaType.APPLICATION_JSON)
		.content(requestJson))
		.andDo(print()).andExpect(status().isOk());
	}

}
