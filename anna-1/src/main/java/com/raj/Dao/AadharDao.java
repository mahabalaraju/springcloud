package com.raj.Dao;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.raj.entityy.Aadhardetails;

@Repository
public class AadharDao {

	public   Object getaadharbyname(String name) {
//		return "{\"adhar\":{\r\n" + 
//				"  \"adharno\":\"" + adhar
//				+ "\",\r\n"
//				+ 
//				"  \"name\":\"mahabala\",\r\n" + 
//				"  \"age\":\"26\",\r\n" + 
//				"  \"address\":\"karnataka\",\r\n" + 
//				"  \"mobNo\":\"8884730494\"\r\n" + 
//				"  \r\n" + 
//				"}}";
		Aadhardetails mahabala=new Aadhardetails(539874011713d,"mahabala",26,"chikkamagalur","mahabalaraj4@gmail.com",8884730494d);
		Aadhardetails hemanth=new Aadhardetails(539874011232d,"hemanth",24,"chikkamagalur","mahabalarajuh@gmail.com",8884730494d);
		 
		Map<String, Aadhardetails> adhar = new HashMap<>();
		adhar.put("hemanth", hemanth);
		adhar.put("mahabala", mahabala);
		
		//adhar.entrySet().stream().fi
		System.out.println(adhar);
		return adhar.get(name);
//	       ObjectMapper objectMapper = new ObjectMapper();
//	        try {
//	            String jsonString = objectMapper.writeValueAsString(adhar);
//
//	           // System.out.println(jsonString);
//
//	            // Optionally, you can write the JSON adhar to a file
//	           // File outputFile = new File("output.json");
//	            //objectMapper.writeValue(outputFile, adhar);
//	        } catch (IOException e) {
//	            e.printStackTrace();
//		
//		
//}
	}	
}