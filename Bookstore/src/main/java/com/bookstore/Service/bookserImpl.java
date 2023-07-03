package com.bookstore.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.Entity.book;
import com.bookstore.Exception.bookalreadyfound;
import com.bookstore.Exception.booknotfoundException;
import com.bookstore.Exception.nosuchbookexist;
import com.bookstore.repo.Book_repository;
@Service
public class bookserImpl implements bookservice {

	@Autowired
	private Book_repository bookrepo;

	@Override
	public void delete(int id) {
//		Optional<book> list=bookrepo.findById(id);
//		if(list.isPresent())
//			bookrepo.deleteById(id);
//		else 
//            throw new bookalreadyfound("asdfasf"); 
	if(!bookrepo.findById(id).isPresent())
		throw new nosuchbookexist("no book found with given id:"+id);
	else
		bookrepo.deleteById(id);
	}

	@Override
	public String update(book book) {
		book existingbook=bookrepo.findById(book.getId()).orElse(null);
		if(existingbook==null)
			throw new nosuchbookexist("no book found with given id:"+book.getId());
		else {
			existingbook.setName(book.getName());
			existingbook.setAuthor(book.getAuthor());
			existingbook.setPrice(book.getPrice());
			
			bookrepo.save(existingbook);
			return "updated book successfully";
		}
	}

	@Override
	public String add(book book) {
		bookrepo.save(book);
		return "success";
	}

	@Override
	public List<book> getall() {
		return bookrepo.findAll();
	}

	@Override
	public Optional<book> getbyid(int id)  {
Optional<book>book= bookrepo.findById(id);
if(book.isPresent())
	book.get();
else
	throw new nosuchbookexist("no book found with given id:"+id);
return book;
			}
}
