package com.m13.reprojecteFinal.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UF {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long ufID;
	String ufCodi;
	int horesUF;
	int horesAssistides;
	int horesFaltas;
	LocalDate data;
	
	public UF(String ufCodi, int horesUF, int horesAssistides, int horesFaltas, LocalDate data) {
		super();
		this.ufCodi = ufCodi;
		this.horesUF = horesUF;
		this.horesAssistides = horesAssistides;
		this.horesFaltas = horesFaltas;
		this.data = data;
	}
	
	public UF(){
		
	}

	public long getUfID() {
		return ufID;
	}

	public void setUfID(long ufID) {
		this.ufID = ufID;
	}

	public String getUfCodi() {
		return ufCodi;
	}

	public void setUfCodi(String ufCodi) {
		this.ufCodi = ufCodi;
	}

	public int getHoresUF() {
		return horesUF;
	}

	public void setHoresUF(int horesUF) {
		this.horesUF = horesUF;
	}

	public int getHoresAssistides() {
		return horesAssistides;
	}

	public void setHoresAssistides(int horesAssistides) {
		this.horesAssistides = horesAssistides;
	}

	public int getHoresFaltas() {
		return horesFaltas;
	}

	public void setHoresFaltas(int horesFaltas) {
		this.horesFaltas = horesFaltas;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
}
