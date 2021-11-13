package com.SEII.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Profesores")
public class Profesores {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdProfesor")
	private int IdProfesor;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	public Profesores(int idProfesor, String nombre) {
		IdProfesor = idProfesor;
		Nombre = nombre;
	}
	public Profesores() {
	}
	public int getIdProfesor() {
		return IdProfesor;
	}
	public void setIdProfesor(int idProfesor) {
		IdProfesor = idProfesor;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
