package com.raj.model;

import java.util.List;
import jakarta.annotation.sql.DataSourceDefinition;
import lombok.Data;

@Data

public class num{
 
	private int num_one;
	private int num_two;
	//private List<Integer> numbers;

	public  int sum() {
		return num_one+num_two;
	}
	
	
}