package com.m13.reprojecteFinal.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m13.reprojecteFinal.entity.Cursos;
import com.m13.reprojecteFinal.entity.Modul;
import com.m13.reprojecteFinal.entity.Unitat_Formativa;
import com.m13.reprojecteFinal.repositories.CursosRepository;
import com.m13.reprojecteFinal.repositories.HoresRepository;
import com.m13.reprojecteFinal.repositories.ModulRepository;

@RestController
@RequestMapping("/apibalmes")
public class api_balmes_controller {
	//Grup
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
	//Grup (Id)
	
	@Autowired
	ModulRepository ModulsRep;
	
	@GetMapping("moduls")
	public ResponseEntity<?> getAllmoduls(){
		List<Modul> listaModuls = ModulsRep.findAll();
		if(listaModuls.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(listaModuls);
		}
	}
	
	@Autowired
	HoresRepository U_formReps;
	
	@GetMapping("moduls")
	public ResponseEntity<?> getAllUF(){
		List<Unitat_Formativa> listaUF = U_formReps.findAll();
		if(listaUF.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(listaUF);
		}
	}
}