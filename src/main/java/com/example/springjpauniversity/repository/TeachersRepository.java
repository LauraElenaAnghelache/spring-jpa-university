package com.example.springjpauniversity.repository;

	import java.util.List;

	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

	import com.example.springjpauniversity.model.Teachers;

	@Repository
	public interface TeachersRepository extends CrudRepository <Teachers, Integer> 
	{

		List<Teachers> findAllByOrderByName();

}
