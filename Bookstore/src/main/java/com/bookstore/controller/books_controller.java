package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.Entity.book;
import com.bookstore.Service.bookservice;

import jakarta.validation.Valid;

@Controller
//@RequestMapping("/api/book_controller")
public class books_controller {

	@Autowired
	private bookservice bookser;
	
	@GetMapping({"/","/home"})
	public String home() {
		return "bookstore";
	}
	
	@PostMapping("/save_booklist")
	public String savebook( @ModelAttribute("books") book boo){
	bookser.add(boo);
		return  "redirect:/available_books";
	}
	
	@GetMapping("/available_books")
	public ModelAndView available() {
		List<book> list=bookser.getall();
		return new ModelAndView("Availablebooks","booklist",list);
	}
	
	@GetMapping("/newbook")
	public ModelAndView addnewbooks() {
		book b=new book();
		return new ModelAndView("new_book_register","books",b);
	}
	
	
	}
	
	
	
	
 




