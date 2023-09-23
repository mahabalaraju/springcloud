package com.champion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.Spring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
public class testSpringmvcIntegeration {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate testresttemplate;

	@Test
	public void getaadhartest() {
		String url = "http://localhost:" + port + "/aadhar";
		UriComponents builder = UriComponentsBuilder.fromHttpUrl(url).queryParam("aadhar", "hemanth").build();
		HttpEntity<String> requestentity = new HttpEntity<>(null);
		ResponseEntity<String> response = testresttemplate.exchange(builder.toString(), HttpMethod.GET, requestentity,
				String.class);
		System.out.println(response.getBody());
		assertEquals(HttpStatus.OK, response.getStatusCode());

	}
	
	
}








