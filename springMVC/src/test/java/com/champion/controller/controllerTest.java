package com.champion.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import com.champion.Service.serviceImpl;
import com.champion.entity.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForGivenType;
@WebMvcTest(controller.class)
@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
class controllerTest {

	@Autowired
	private MockMvc mockmvc;
	
	@MockBean
	private serviceImpl ser;
	person person;
	List<person> personlist;
	
	@Autowired
	ObjectMapper objectmapper;
	
	@Test
	void testGetall() throws Exception {
	when(ser.getall()).thenReturn(personlist);
	this.mockmvc.perform(get("/getall")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	void testSave() throws JsonProcessingException {
	person raj=person.builder().name("mahabala").address("thegur")
			.id(1).build();
	when(ser.add(raj)).thenReturn("success");
	RequestBuilder request=post("/saveperson")
			.contentType(MediaType.APPLICATION_JSON)
			.content(objectmapper.writeValueAsString(raj));
	mockmvc.perform(request)
    .andExpect(status().isCreated())
    .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
    .andExpectAll(
            jsonPath("$.topicId").value("1"),
            jsonPath("$.title").value("topic")
    );
	}
	@Test
	void testAddperson() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateperson() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteperson() {
		fail("Not yet implemented");
	}

}
