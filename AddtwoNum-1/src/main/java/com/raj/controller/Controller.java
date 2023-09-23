package com.raj.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.raj.model.num;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/form")
	public String showform(Model model) {
		model.addAttribute("num",new num());
		return "NewFile";
	}
	@PostMapping("/result")
	public ModelAndView processform(@ModelAttribute num num) {
return new ModelAndView("NewFile1","num1",num);
		//return num.getNumbers().stream().reduce(0,Integer::sum);
	}
			
}
