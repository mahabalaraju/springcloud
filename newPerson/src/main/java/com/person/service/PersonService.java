package com.person.service;

import java.util.List;
import java.util.Optional;

import com.person.entity.entity;

public interface PersonService {
	public String delete(int id);

	public String upsert(entity person);

	public entity getbyid(int id);

	public List<entity> getall();

	public String update(entity person, int id);

	public String update(entity person);
}
