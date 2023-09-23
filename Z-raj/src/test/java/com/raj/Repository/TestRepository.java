package com.raj.Repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.raj.entity.Employee;

@DataJpaTest
public class TestRepository {

	@Autowired
	private repository repo;
	
	
	@Test
	void TestsaveEmployee() {
		Employee newEmp= Employee.builder().address("thegur")
				.name("mahabala")
				.build();
		repo.save(newEmp);
	assertThat(newEmp.getId()).isGreaterThan(0);
}
	@Test
	void Testfindbyname() {
		List<Employee> emp= repo.findByName("mahabala");
		assertThat(emp.get(0).getName()).isEqualTo("mahabala");
	}
	@Test
	void TestGetemployees() {
		Employee emp=repo.findById(1).get();
		assertThat(emp.getId()).isEqualTo(1);
		
}}
