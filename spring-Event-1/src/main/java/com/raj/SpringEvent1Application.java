package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.publisher.HackerLoi;

@SpringBootApplication
public class SpringEvent1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =	SpringApplication.run(SpringEvent1Application.class, args);
	HackerLoi clas= context.getBean(HackerLoi.class);
	 clas.metasploit("class -1");
	 
	}

}
