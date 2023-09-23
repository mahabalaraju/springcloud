package com.raj.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.raj.microservices.beans.PropertyAccessbeans;

@SpringBootApplication
@PropertySource("cloud-test.properties")
@EnableConfigurationProperties(PropertyAccessbeans.class)
public class RajSpringPropertyAccessFileApplication {

	public static void main(String[] args) {
	var context=	SpringApplication.run(RajSpringPropertyAccessFileApplication.class, args);
	PropertyAccessbeans bean=context.getBean(PropertyAccessbeans.class);
	System.out.println(bean);
	}
@Bean
@ConfigurationProperties
public PropertyAccessbeans saf()
{
	return new PropertyAccessbeans();
}
}
