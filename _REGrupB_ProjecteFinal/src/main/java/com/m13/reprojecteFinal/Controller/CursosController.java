package com.m13.reprojecteFinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m13.reprojecteFinal.entity.Cursos;
import com.m13.reprojecteFinal.repositories.CursosRepository;

@RestController
@RequestMapping("/apiadmin")
public class CursosController {
	@Autowired
	CursosRepository CursosRep;
	
	@GetMapping("cursos")
	public ResponseEntity<?> getAllCursos(){
		List<Cursos> listaCursos = CursosRep.findAll();
		if(listaCursos.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(listaCursos);
		}
	}
}
