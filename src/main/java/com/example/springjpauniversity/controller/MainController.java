package com.example.springjpauniversity.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

	import com.example.springjpauniversity.model.University;
	import com.example.springjpauniversity.repository.UniversityRepository;

	@Controller
	@RequestMapping("/")
	public class MainController {
		
	@Autowired	
	private UniversityRepository repo;	
	@GetMapping
	public String home(Model model) {
		List<University> DepartmentsList =(List<University>)repo.findAll();
		model.addAttribute("DepartmentsList" ,DepartmentsList);
		return "home";
	}
	}

