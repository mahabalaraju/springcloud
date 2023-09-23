package com.raj.microservices;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class person {
 
	private int id;
	private String name;
	private String email;
	private double salary;
	private List<String> phoneNumbers;
}
