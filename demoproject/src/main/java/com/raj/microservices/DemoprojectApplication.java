package com.raj.microservices;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.microservices.propertysource.PropertysourceDemo;
import com.raj.microservices.propertysource.propertysourcedemoForEnv;

@SpringBootApplication
@RestController
public class DemoprojectApplication {
    @Value("${app.madeBy}")
	private String greetings;
    
	@Value("hello java devoloper")
	private String messages;
	
    @Value("${my.greetings:default value}")
    private String message;
    
    @Value("${hi:1,3,3}")
    private List<String> list;
    
    @Value("#{${Url}}")
    private Map<String, String> url;
    
	@GetMapping("/hello")
	public String hell0() {
		return greetings+message+list+url+messages;
	}
	
	public static void main(String[] args) {
		var context= SpringApplication.run(DemoprojectApplication.class, args);
       PropertysourceDemo demo= context.getBean(PropertysourceDemo.class);
       System.out.println(demo.getEmail());
       System.out.println(demo.getHost());
       System.out.println(demo.getPassword());
       
       System.out.println(demo.getName());
       System.out.println(demo.getMadeby());
       System.out.println(demo.getMadein());
       
      propertysourcedemoForEnv env= context.getBean(propertysourcedemoForEnv.class);
      System.out.println(env.getName());
      System.out.println(env.getMobileNo());
      System.out.println(env.getAddress());
	}

}
