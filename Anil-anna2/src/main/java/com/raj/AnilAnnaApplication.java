package com.raj;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.raj.Repository.productRepository;
import com.raj.entity.product;

@SpringBootApplication
public class AnilAnnaApplication {
	@Autowired
	private  productRepository repo;

	public static void main(String[] args) {
	SpringApplication.run(AnilAnnaApplication.class, args);
	//product product = context.getBean(product.class);
	//product.builder().name("product1").Description("description1").price(new BigDecimal(121)).build();
	//repo.save(product);
	}

//	@Bean
//	public String create() {
//		product product= new product();
//		product.setName("product");
//		product.setPrice(new BigDecimal(121) );
//		product.setDescription("sdafd");
//		repo.save(product);
//		return "success";
//	
//	}
}
