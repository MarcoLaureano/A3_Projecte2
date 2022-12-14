package com.m13.reprojecteFinal.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HoresEntrada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long horesID;
	LocalTime horaEntrada;
	LocalTime horaSortida;
}
