package com.m13.reprojecteFinal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.m13.reprojecteFinal.entity.Alumne;

public interface AlumneRepository extends CrudRepository<Alumne, Long>{
	public List<Alumne> findAll();
	
	Iterable <Alumne> findByNom(String nom);
}

