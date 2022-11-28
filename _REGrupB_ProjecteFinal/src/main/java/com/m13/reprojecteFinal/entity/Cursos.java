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

		public String getGrup() {
			return grup;
		}

		public void setGrup(String grup) {
			this.grup = grup;
		}

		public String getCurs() {
			return curs;
		}

		public void setCurs(String curs) {
			this.curs = curs;
		}

		public String getAula() {
			return aula;
		}

		public void setAula(String aula) {
			this.aula = aula;
		}

		public String getCicle() {
			return cicle;
		}

		public void setCicle(String cicle) {
			this.cicle = cicle;
		}

		public long getGrupid() {
			return grupid;
		}

		public void setGrupid(long grupid) {
			this.grupid = grupid;
		}
		
}
