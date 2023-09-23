package com.champion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.champion.Service.personService;
import com.champion.person.person;
 
@Controller
public class controller {

	@Autowired
	private personService ser;

	
	@GetMapping("/")
	public ModelAndView getall() {
		List<person> list = ser.getall();
		return new ModelAndView("NewFile1", "epr", list);
	}

	@PostMapping("/saveperson")
	public String save(@ModelAttribute person per) {
		ser.add(per);
		return "redirect:/";
	}

	@GetMapping("/addperson")
	public ModelAndView addperson() {
		person p = new person();
		return new ModelAndView("NewFile", "epr", p);
	}

	@GetMapping("/update/{id}")
	public ModelAndView updateperson(@PathVariable int id) {
		Optional<person> p = ser.getbyid(id);
		return new ModelAndView("NewFile1", "epr", p);
	}

	@GetMapping("/delete/{id}")
	public String deleteperson(@PathVariable int id) {
		ser.delete(id);
		return "redirect:/";
	}

}
