package com.bookstore.Service;

import java.util.List;
import java.util.Optional;

import com.bookstore.Entity.book;

public interface bookservice {

	public void delete(int id);
	public String update(book book);
	public String add(book book);
	public List<book> getall();
	public Optional<book> getbyid(int id);
	
}
