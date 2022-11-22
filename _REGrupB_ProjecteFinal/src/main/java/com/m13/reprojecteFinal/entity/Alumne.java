package com.m13.reprojecteFinal.entity;

import javax.persistence.Entity;

@Entity
public class Alumne {
	String email;
	String nom;
	String cognoms;
	String grup;
	int grupId;
	
	public Alumne(String email, String nom, String cognoms, String grup, int grupId) {
		this.email = email;
		this.nom = nom;
		this.cognoms = cognoms;
		this.grup = grup;
		this.grupId = grupId;
	}
	
	public Alumne() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public String getGrup() {
		return grup;
	}

	public void setGrup(String grup) {
		this.grup = grup;
	}

	public int getGrupId() {
		return grupId;
	}

	public void setGrupId(int grupId) {
		this.grupId = grupId;
	}
	
}
