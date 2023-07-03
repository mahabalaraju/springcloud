package com.bookstore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.Entity.book;
import com.bookstore.Entity.mybooks;
import com.bookstore.Service.bookservice;
import com.bookstore.Service.mybookservice;
import com.bookstore.repo.Book_repository;
import com.bookstore.repo.mybookrepo;

import jakarta.validation.Valid;

@Controller
//@RequestMapping("/api/mybookcontroller")
public class mybooklistcontroller {
	@Autowired
	private bookservice ser;

	@Autowired
	private mybookservice repo;
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		ser.delete(id);
		return "redirect:/available_books";
	}

	@GetMapping("/update/{id}")
	public ModelAndView update(@Valid @PathVariable int id) {
		book b = ser.getbyid(id).get();
		return new ModelAndView("Addnewbooks", "book", b);
	}

	@GetMapping("/mybooklist")
	public ModelAndView mybooklist() {
		List<mybooks> list=repo.getall();
		return new ModelAndView("mybooks","booklistss",list);
	}
	@GetMapping("/mybook/{id}")
	public String myboo(@PathVariable int id) {
    book b=ser.getbyid(id).get(); 
     mybooks s=new mybooks(b.getId(),b.getAuthor(),b.getName(),b.getPrice());
    	 repo.save(s);
    return "redirect:/mybooklist";
	}

	@GetMapping("/deletebooks/{id}")
	public String getall(@PathVariable int id) {
		repo.delete(id);
		return "redirect:/mybooklist";
	}
}





