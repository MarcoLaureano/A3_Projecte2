package com.m13.reprojecteFinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cursos{
		String grup;
		String curs;
		String aula;
		String cicle;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long grupid;
		
		public Cursos(String grup, String curs, String aula, String cicle) {
			super();
			this.grup = grup;
			this.curs = curs;
			this.aula = aula;
			this.cicle = cicle;
		}
		
		public Cursos() {
			
		}
}
