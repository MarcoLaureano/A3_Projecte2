package com.m13.reprojecteFinal.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unitat_Formativa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long ufID;
	String UF_Num;
	int UF_HoresTotal;
	
	public Unitat_Formativa(String UF_Num, int UF_HoresTotal) {
		super();
		this.UF_Num = UF_Num;
		this.UF_HoresTotal= UF_HoresTotal;
	}
	
	public Unitat_Formativa(){
		
	}

	public long getUfID() {
		return ufID;
	}

	public void setUfID(long ufID) {
		this.ufID = ufID;
	}

	public String getUF_Num() {
		return UF_Num;
	}

	public void setUF_Num(String uF_Num) {
		UF_Num = uF_Num;
	}

	public int getUF_HoresTotal() {
		return UF_HoresTotal;
	}

	public void setUF_HoresTotal(int uF_HoresTotal) {
		UF_HoresTotal = uF_HoresTotal;
	}
	
}
