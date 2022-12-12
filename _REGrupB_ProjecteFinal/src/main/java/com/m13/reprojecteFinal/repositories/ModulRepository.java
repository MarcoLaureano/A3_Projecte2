package com.m13.reprojecteFinal.repositories;

import com.m13.reprojecteFinal.entity.Modul;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ModulRepository extends CrudRepository<Modul,Long> {
    public List<Modul> findAll();

}