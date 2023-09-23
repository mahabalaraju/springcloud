package com.champion.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.champion.Repo.personRepo;
import com.champion.entity.person;

@ExtendWith(MockitoExtension.class)
class serviceImplTest {

	@Mock
	private personRepo repo;
	@Mock
	private person person;

	@InjectMocks
	serviceImpl ser;

	@Test
	void testGetall() {
	when(repo.findAll()).thenReturn(new ArrayList<>(Collections.singleton(person)));
	assertThat(ser.getall().get(0).getName()).isEqualTo(person.getName());
	}

	@Test
	void testDeletepersonSuccess() {
	when(repo.findById(person.getId())).thenReturn(Optional.of(person));
	assertThat(ser.delete(0)).isEqualTo("delete success");
	}


	@Test
	void testGetbyid() {
	when(repo.findById(person.getId())).thenReturn(Optional.of(person));
	assertThat(ser.getbyid(person.getId())).isEqualTo(Optional.ofNullable(person));
	}

	@Test
	void testAdd() {
		assertThat(ser.add(person)).isEqualTo("success");
	}

	@Test
	void testUpdate() {
	when(repo.findById(person.getId())).thenReturn(Optional.of(person));
	assertThat(ser.update(person)).isEqualTo("update successful");
	}

}
