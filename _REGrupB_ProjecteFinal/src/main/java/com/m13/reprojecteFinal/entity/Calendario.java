package com.m13.reprojecteFinal.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calendario {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		long idCalendary;
		LocalDate startUF;
		LocalDate endUF;
		
		public Calendario(LocalDate startUf, LocalDate endUf ) {
			super();
			this.startUF = startUf;
			this.endUF = endUf;
		}
		
		public Calendario() {
			
		}
		
		public LocalDate getStartUF() {
			return startUF;
		}
		public void setStartUF(LocalDate startUF) {
			startUF = startUF;
		}
		public LocalDate getEndUF() {
			return endUF;
		}
		public void setEndUF(LocalDate endUF) {
			endUF = endUF;
		}

		public long getIdCalendary() {
			return idCalendary;
		}

		public void setIdCalendary(long idCalendary) {
			this.idCalendary = idCalendary;
		}
		
		
}
