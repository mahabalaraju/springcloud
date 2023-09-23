package com.raj.entityy;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@EntityScan
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aadhardetails {

	private double AadharId;
	private String name ;
	private int age;
    private String address;
    private String email;
    private double mobile_no;
    
	
	
}
