package com.m13.reprojecteFinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	//Grup
	//Grup (Id)
}
