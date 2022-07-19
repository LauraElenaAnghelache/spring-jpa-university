package com.example.springjpauniversity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.springjpauniversity.repository.DegreesRepository;

@Controller
@RequestMapping("/corsi")
public class DegreesController 
{
	@Autowired
	private DegreesRepository repo;
	
	@GetMapping
	public String degrees(Model model) 
	{
		model.addAttribute("DegreesList" , repo.findAll());		
		return "degrees";
	}
	
}