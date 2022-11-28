package com.m13.reprojecteFinal.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m13.reprojecteFinal.entity.Alumne;
import com.m13.reprojecteFinal.repositories.AlumneRepository;

@RestController
@RequestMapping("/apiadmin")
public class AlumneController {
	@Autowired
	AlumneRepository alumneRep;
	
	//Alumnes (Id) 
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
	public ResponseEntity<?> getGrup(@PathVariable String group) {
		List<Alumne> llistatAlumnes = alumneRep.findAll();
		long id;
		List<Long> i = new ArrayList<>();
		int j = 0;
		for (Alumne a : llistatAlumnes) {
			if (a.getGrup().equals(getGrup(group))) {
				id = a.getId();
				if (alumneRep.findById(id).isPresent()) {
					i.add(a.getId());
					j++;
				}
			}
		}
		return (ResponseEntity<?>) alumneRep.findAllById(i);
	}
	
	//Grup
	//Grup (Id)
}
