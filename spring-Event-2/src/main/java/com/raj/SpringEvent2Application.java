package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.raj.publisher.mahabala;

@SpringBootApplication
@Controller
public class SpringEvent2Application {


	public static void main(String[] args) {
ConfigurableApplicationContext context=		SpringApplication.run(SpringEvent2Application.class, args);
mahabala raj=	context.getBean(mahabala.class);
	raj.metasploit("1");
	raj.phishingattack("1");
	}

}
