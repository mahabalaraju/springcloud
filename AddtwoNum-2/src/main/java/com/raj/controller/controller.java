package com.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.raj.model.Numbers;

@Controller
public class controller {

	@GetMapping("/form")
	public ModelAndView asdf() {
		return new ModelAndView("NewFile","num",new Numbers());
	}
	@PostMapping("/addition")
	public ModelAndView as(@ModelAttribute Numbers num) {
		return new ModelAndView("NewFile1","number",num);
	}
}
