package com.m13.reprojecteFinal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.m13.reprojecteFinal.entity.Cursos;

public interface CursosRepository extends CrudRepository<Cursos, Long>{
	public List<Cursos> findAll();
}