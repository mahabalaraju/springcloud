package com.raj.Repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.raj.entity.product;
@DataJpaTest
public class TestProductRepository {

	@Autowired
	private productRepository repo;
	product  product;
	
	@BeforeEach
	void setup() {
		product product=new product();
		product.builder().Description("discription1").name("product1").price(new BigDecimal(121)).build();
			repo.save(product);
	}
	@AfterEach
	void teardown() {
		product=null;
		repo.deleteAll();
	}
	//testcase for success scenario
	@Test
	void testfindbyname() {
		List<product> productlist=repo.findByName("product1");
		assertThat(productlist.get(0).getDescription()).isEqualTo(product.getDescription());
	    assertThat(productlist.get(0).getPrice()).isEqualTo(product.getPrice());
	}
	//testcase for failure scenario
		@Test
		void testfindbyname_notfound() {
			List<product> productlist=repo.findByName("product");
			assertThat(productlist.isEmpty()).isTrue();
		  		}
	
}













