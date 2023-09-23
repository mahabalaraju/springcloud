package com.raj;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.containers.Container;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.raj.model.student;
import com.raj.repo.studentRepository;

@SpringBootTest
@AutoConfigureMockMvc
@Testcontainers
class AaSpringbootTestcontainersApplicationTests {

	@org.testcontainers.junit.jupiter.Container
	private static MySQLContainer mysqlcontainer=new MySQLContainer<>("mysql:latest");
//.withDatabaseName("mahabala")
//.withUsername("root")
//.withPassword("root-123");
	
	@DynamicPropertySource
	public static void overrideprops(DynamicPropertyRegistry registry) {
		registry.add("spring datasource url",mysqlcontainer::getJdbcUrl);
		registry.add("spring datasource username",mysqlcontainer::getClass);
		registry.add("spring datasource username",mysqlcontainer::getDatabaseName);
		registry.add("spring datasource username",mysqlcontainer::getUsername);
		registry.add("spring datasource username",mysqlcontainer::getPassword);
	}
	
	
	@Autowired
	studentRepository repo;
	
	@Autowired
	private MockMvc mockmvc;
	
	@Test
	void getallstudents() throws Exception {
		//just for my understanding 
		System.out.println(mysqlcontainer.getContainerName());
		System.out.println(mysqlcontainer.getDatabaseName());
		System.out.println(mysqlcontainer.getPassword()); 
		System.out.println(mysqlcontainer.getUsername());
		System.out.println(mysqlcontainer.getJdbcUrl());
		
		//given -setup or precondition
	List<student> getall=List.of(student.builder().name("raj").email("raj@gmail.com").id(1).build(),
			student.builder().name("raju").email("raj@gmail.com").id(2).build()
			);
	repo.saveAll(getall);
	
	//when -action
	ResultActions response=mockmvc.perform(MockMvcRequestBuilders.get("/api/students"));
	
	//then verify the output
	response.andExpect(MockMvcResultMatchers.status().isOk());
	response.andExpect(MockMvcResultMatchers.jsonPath("$.size()", CoreMatchers.is(getall.size())));

}}
