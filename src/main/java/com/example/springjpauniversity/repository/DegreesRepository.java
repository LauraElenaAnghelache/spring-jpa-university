package com.example.springjpauniversity.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpauniversity.model.Degrees;


@Repository
public interface DegreesRepository extends CrudRepository <Degrees, Integer> 
{

	List<Degrees> findAllByOrderByName();

}

