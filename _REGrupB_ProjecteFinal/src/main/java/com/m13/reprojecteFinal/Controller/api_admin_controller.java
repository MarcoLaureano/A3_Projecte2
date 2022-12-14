package com.m13.reprojecteFinal.Controller;

import java.util.ArrayList;
import java.util.List;


import com.m13.reprojecteFinal.repositories.UFRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m13.reprojecteFinal.entity.Alumne;
import com.m13.reprojecteFinal.entity.Unitat_Formativa;
import com.m13.reprojecteFinal.repositories.AlumneRepository;


@RestController
@RequestMapping("/apiadmin")
public class api_admin_controller {
	@Autowired
	AlumneRepository alumneRep;
	
	//Alumnes
	@GetMapping("alumnes")
	public ResponseEntity<?> getAllAlumnes(){
		List<Alumne> listaAlumnes = alumneRep.findAll();
		if(listaAlumnes.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(listaAlumnes);
		}
	}
	
	@GetMapping("alumnes/{cicle}")
	public ResponseEntity<?> getGrup(@PathVariable("cicle") String group) {
		List<Alumne> llistatAlumnes = alumneRep.findAll();
		long id;
		List<Long> i = new ArrayList<>();
		int j = 0;
		for (Alumne a : llistatAlumnes) {
			if (a.getGrup().equals(group)) {
				id = a.getId();
				if (alumneRep.findById(id).isPresent()) {
					i.add(a.getId());
					j++;
				}
			}
		}
		return ResponseEntity.ok(alumneRep.findAllById(i));
	}
	
	@GetMapping("alumnes/{nom}")
	public ResponseEntity<?> getNames(@PathVariable("nom") String nom) {
		Iterable<?> alumne;
		if((alumne = alumneRep.findByNom(nom)) != null) {
			return ResponseEntity.ok(alumne);
		}
		return ResponseEntity.notFound().build();
		}
		
	@Autowired
	UFRepository horesRep;
	
	//unitat_Formativa
	@GetMapping("faltes")
	public ResponseEntity<?>getFaltes(){
		List<Unitat_Formativa> listaFaltes = horesRep.findAll();
		if(listaFaltes.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(listaFaltes);
		}
	}
}