package com.person.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.Exception.personnotfoundException;
import com.person.entity.entity;
import com.person.repo.PersonRepo;
@Service
public class personServices implements PersonService {

	@Autowired
	private PersonRepo repo;

	@Override
	public String delete(int id) {
		if(repo.findById(id).isEmpty())
			throw new personnotfoundException("person not found with the given id:"+id);
		else 
			repo.deleteById(id);
		return "deleted sucessfully";
	}

	@Override
	public String upsert(entity person) {
		repo.save(person);
		return "success";
	}

	@Override
	public entity getbyid(int id) {
		entity per=Optional.ofNullable(repo.findById(id).get())
				.orElseThrow(()->new personnotfoundException("person not found with the given id:"+ id));
		return per;
		}

	@Override
	public List<entity> getall() {
		List<entity> getall=repo.findAll();
		return getall;
	}

	@Override
	public String update(entity person) {
		entity existingperson = repo.findById(person.getId()).orElse(null);
		if(existingperson!=null) {
	existingperson.setName(person.getName());
	existingperson.setAge(person.getAge());
	repo.save(existingperson);
	return "updated success";
	}
		else
		throw new personnotfoundException("person not found with the given id:"+person.getId());
		
		
	}

	@Override
	public String update(entity person, int id) {
		entity existingperson=Optional.ofNullable(repo.findById(id).get()).orElse(null);
		if(existingperson!=null) {
			existingperson.setName(person.getName());
			existingperson.setAge(person.getAge());
			repo.save(existingperson);
			return "updated success";
			}
				else
				throw new personnotfoundException("person not found with the given id:"+person.getId());
				
				
	
	}

}
