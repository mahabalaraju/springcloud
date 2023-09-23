package com.champion.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.champion.Exception.personnotfoundexception;
import com.champion.Repo.personRepo;
import com.champion.person.person;

@Service
public class serviceImpl implements personService {

	@Autowired
	private personRepo repo;

	@Override
	public List<person> getall() {
		return repo.findAll();
	}

	@Override
	public String delete(int id) {
		Optional<person> per = Optional.ofNullable(repo.findById(id))
				.orElseThrow(() -> new personnotfoundexception("no person found with given id" + id));
		if (per.isPresent())
			repo.deleteById(id);
		return "delete success";
	}

	@Override
	public Optional<person> getbyid(int id) {
		return Optional.ofNullable(repo.findById(id))
				.orElseThrow(() -> new personnotfoundexception("no person found with given id" + id));

	}

	@Override
	public String upsert(person person) {
		repo.save(person);
		return "success";
	}

//	@Override
//	public String update(person person) {
//		person existingperson = repo.findById(person.getId()).get();
//		if (existingperson != null) {
//			existingperson.setName(person.getName());
//			existingperson.setAddress(person.getAddress());
//			repo.save(existingperson);
//			return "update successful";
//		} else
//			throw new personnotfoundexception("no person found with given id" + person.getId());
//	}

}
