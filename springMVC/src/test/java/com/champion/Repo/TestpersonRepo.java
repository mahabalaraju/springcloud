package com.champion.Repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.champion.entity.person;

@DataJpaTest
public class TestpersonRepo {

	@Autowired
	personRepo personrepo;

	@BeforeEach
	void setup() {
		personrepo.saveAllAndFlush(
				List.of(new person(1, "maha", "adaf"), new person(2, "bala", "afa"), new person(3, "raju", "adsd")));
	}

	@Test
	void TestSuccessfindByName() {

		List<person> list = personrepo.findByName("maha");
		assertThat(list).hasSize(1);
		assertThat(list).extracting(person::getName).containsExactly("maha");

	}

	@Test
	void TestthatpersonRepositoryCreated() {
		List<person> list = personrepo.findByName("name");
		assertThat(list.isEmpty()).isTrue();
	}

	@Test
	void findallfortesting() {
		List<person> list = personrepo.findAll();
		assertThat(list).hasSize(3);
		assertThat(list.size()).isGreaterThan(0);
	}

	@Test
	void findbyid() {
		person p = personrepo.findById(1).get();
		assertThat(p.getId()).isEqualTo(1);
	}

	@Test
	void testsavemethod() {
		person pers = person.builder().name("H mahabala").id(8).address("ckm").build();
		personrepo.save(pers);
		assertThat(pers.getId()).isGreaterThan(0);
	}

	@Test
	void testupdatePerson() {
		person person = personrepo.findById(1).get();
		person.setName("raju");
		person updatedperson = personrepo.save(person);
		assertThat(updatedperson.getName()).isEqualTo("raju");
	}

	@Test
	void testdeleteperson() {
     person person= personrepo.findById(1).get();
     personrepo.delete(person);
     assertThat(personrepo.findById(1)).isEmpty();
	}

}
