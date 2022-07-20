package com.example.springjpauniversity.controller;


import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import com.example.springjpauniversity.model.Departments;
	import com.example.springjpauniversity.repository.DepartmentsRepository;

	@Controller
	@RequestMapping("/dipartimenti")
	public class DepartmentsController 
	{
		@Autowired
		private DepartmentsRepository repo;
		
		@GetMapping
		public String departmentsList(Model model)
		{
			//List<Department> DepartmentsList =(List<Department>)repo.findAll();
			//model.addAttribute("DepartmentsList" , DepartmentsList);
			
			model.addAttribute("DepartmentsList" , repo.findAll());
			return "departments";
		}
		@GetMapping("/{departmentId}")
		public String departmentsDetail(Model model,
				@PathVariable(name = "departmentId") Integer departmentsPrimaryKey)
		{
			Departments curDep = repo.findById(departmentsPrimaryKey).get();
			model.addAttribute("department", curDep);
			return "departmentsDetail";
		}
	
	}
	

