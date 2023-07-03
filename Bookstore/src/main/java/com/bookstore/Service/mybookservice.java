package com.bookstore.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.Entity.mybooks;
import com.bookstore.repo.mybookrepo;

@Service
public class mybookservice {

	@Autowired
	private mybookrepo mybookrepo;

	public void save(mybooks book) {
		mybookrepo.save(book);
	}

	public mybooks getbyid(int id) {
		return mybookrepo.findById(id).get();
	}

	public List<mybooks> getall() {
		return mybookrepo.findAll();
	}

	public void delete(int id) {
		mybookrepo.deleteById(id);
	}
}
