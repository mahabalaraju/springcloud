package com.champion.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.champion.entity.person;

//import io.micrometer.core.ipc.http.HttpSender.Response;

public class RestClient {

	private static final String GET_ALL_USERS_API = "http://localhost:1001/api/person";
	private static final String GET_USERS_BY_ID_API = "http://localhost:1001/api/person/id/{id}";
	private static final String CREATE_USERS_API = "http://localhost:1001/api/person";
	private static final String DELETE_USERS_BY_ID_API = "http://localhost:1001/api/person/{id}";
	private static final String UPDATE_USERS_API = "http://localhost:1001/api/person/{id}";
	private static final String GET_ALL_USERS_BY_NAME_API = "http://localhost:1001/api/person/{name}";

	static RestTemplate template = new RestTemplate();

	public static void main(String[] args) {
		callGetAllUsersApi();
		callGetbyIdApi();
		callCreateUserApi();
		callUpdateUserApi();
		callDeleteUserApi();
		callfindbyusername();
	}

	public static void callGetAllUsersApi() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

		ResponseEntity<String> result = template.exchange(GET_ALL_USERS_API, HttpMethod.GET, entity, String.class);
		System.out.println(result);
	}

	public static void callGetbyIdApi() {
		Map<String, Integer> param = new HashMap<>();
		param.put("id", 1);

		person person = template.getForObject(GET_USERS_BY_ID_API, person.class, param);
		System.out.println(person.getAddress());
		System.out.println(person.getName());
	}

	public static void callCreateUserApi() {
		person per = person.builder().name("raj").address("ckm").build();
		ResponseEntity<person> p = template.postForEntity(CREATE_USERS_API, per, person.class);
		System.out.println(p.getBody());
	}

	public static void callUpdateUserApi() {
		Map<String, Integer> param = new HashMap<>();
		param.put("id", 20);
		person updatePerson = person.builder().name("raju").address("chikkamagalur").build();
		template.put(UPDATE_USERS_API, updatePerson,param);
		
	HttpHeaders headers=new HttpHeaders();
	headers.setAccept( Arrays.asList(MediaType.APPLICATION_JSON));
	HttpEntity<String> responseentity=new HttpEntity<>(headers);
	ResponseEntity<String> result= template.exchange(UPDATE_USERS_API,HttpMethod.PUT,responseentity, String.class);
	System.out.println(result);
	}

	private static void callDeleteUserApi() {
		Map<String, Integer> param = new HashMap<>();
		param.put("id", 20);
		template.delete(DELETE_USERS_BY_ID_API, param);
	}

	private static void callfindbyusername() {
		Map<String, String> param = new HashMap<>();
		param.put("name", "mahabala");
		person per = template.getForObject(GET_ALL_USERS_BY_NAME_API, person.class, param);
		System.out.println(per.getAddress() + "\n" + per.getName() + "\n" + per.getId());
	}
}
	

