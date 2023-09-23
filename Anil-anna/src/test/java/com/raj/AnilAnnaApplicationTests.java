package com.raj;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcResultMatchersDsl;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.raj.Repository.productRepository;
import com.raj.Service.ServiceImpl;
import com.raj.entity.product;

@SpringBootTest
@AutoConfigureMockMvc
class AnilAnnaApplicationTests {

	@Autowired
	productRepository repo;
	
	@Autowired
	private MockMvc mockmvc;
	
	@Test
	void getallstudents() throws Exception {
		//given -setup or precondition
	List<product> getall=List.of(product.builder().name("desk").Description("very good product")
			.id(1).build(),
			product.builder().name("Anydesk").Description("very good software-product")
			.id(2).build()
			);
	repo.saveAll(getall);
	
	//when -action
	ResultActions response=mockmvc.perform(MockMvcRequestBuilders.get("/products"));
	
	//then verify the output
	response.andExpect(MockMvcResultMatchers.status().isOk());
	response.andExpect(MockMvcResultMatchers.jsonPath("$.size()", CoreMatchers.is(getall.size())));
	}

}
