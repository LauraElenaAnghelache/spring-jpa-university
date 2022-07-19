package com.example.springjpauniversity.repository;

	import java.util.List;

	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

	import com.example.springjpauniversity.model.Departments;

	@Repository
	public interface DepartmentsRepository extends CrudRepository <Departments, Integer> 
	{

		List<Departments> findAllByOrderByName();

	}

