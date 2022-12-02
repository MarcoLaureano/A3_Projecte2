package com.m13.reprojecteFinal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.m13.reprojecteFinal.entity.UF;

public interface HoresRepository extends CrudRepository<UF, Long>{
	public List<UF> findAll();
}
