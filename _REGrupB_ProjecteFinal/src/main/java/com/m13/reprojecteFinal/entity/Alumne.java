package com.m13.reprojecteFinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumne {
	String email;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	String nom;
	String cognoms;
	String grup;
	int grupId;

	public Alumne() {
	}
	
	public Alumne(String email, String nom, String cognoms, String grup, int grupId) {
		super();
		this.email = email;
		this.nom = nom;
		this.cognoms = cognoms;
		this.grup = grup;
		this.grupId = grupId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
