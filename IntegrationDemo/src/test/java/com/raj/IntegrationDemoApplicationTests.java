package com.raj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.raj.controller.controller;

//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@WebMvcTest(controller.class)
@ExtendWith(SpringExtension.class)
class IntegrationDemoApplicationTests {

	@Autowired
	MockMvc mockmvc;

	@Test
	void contextLoads() throws Exception {
		RequestBuilder request= MockMvcRequestBuilders.get("/hello");
		MvcResult result=mockmvc.perform(request).andReturn();
		assertEquals("helloworld", result.getResponse().getContentAsString());
	}

	@Test
	void testhellowithname() throws Exception {
	 mockmvc.perform(get("/hello?name=mahabala"))
	.andExpect(content().string("hellomahabala"));
	}
}
