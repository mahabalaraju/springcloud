package com.champion.Service;

import java.util.List;
import java.util.Optional;

import com.champion.person.person;

public interface personService {

	public List<person> getall();
	public String delete(int id);
	public Optional<person> getbyid(int id);
	public String add(person person);
	public String update(person person);
}
