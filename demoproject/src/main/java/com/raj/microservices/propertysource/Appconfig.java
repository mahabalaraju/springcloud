package com.raj.microservices.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:mail.properties")
//@PropertySource("classpath:message.properties")
//@PropertySource("classpath:raj.properties")
@PropertySources({
	@PropertySource("classpath:mail.properties"),
	@PropertySource("classpath:message.properties"),
    @PropertySource("classpath:raj.properties")
})
public class Appconfig {

}
