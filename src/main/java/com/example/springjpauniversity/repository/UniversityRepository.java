package com.example.springjpauniversity.repository;

	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

	import com.example.springjpauniversity.model.University;

	@Repository
	public interface UniversityRepository extends CrudRepository <University, Integer> {


		

	}

