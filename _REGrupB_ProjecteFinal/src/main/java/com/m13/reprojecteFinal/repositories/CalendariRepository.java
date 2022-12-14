package com.m13.reprojecteFinal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.m13.reprojecteFinal.entity.Calendario;

public interface CalendariRepository extends CrudRepository<Calendario, Long>{
	public List<Calendario> findAll();

}
