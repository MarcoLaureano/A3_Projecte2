package com.m13.reprojecteFinal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.m13.reprojecteFinal.entity.Unitat_Formativa;

public interface UFRepository extends CrudRepository<Unitat_Formativa, Long>{
	public List<Unitat_Formativa> findAll();
}
