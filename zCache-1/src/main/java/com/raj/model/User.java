package com.raj.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("User")
public class User implements Serializable {
	@Id
	private int id;
	private String name;
	private String age;
	private String address;
	private String email;
}
