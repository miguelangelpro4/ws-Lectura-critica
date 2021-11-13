package com.SEII.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Roll")
public class Roll {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdRoll")
	private int IdRoll;
	
	@Column(name = "NombreRoll")
	private String NombreRoll;
	
	@Column(name = "Descripcion")
	private String Descripcion;
	
	public Roll(int idRoll, String nombreRoll, String descripcion) {
		IdRoll = idRoll;
		NombreRoll = nombreRoll;
		Descripcion = descripcion;
	}
	public Roll() {
	}
	public int getIdRoll() {
		return IdRoll;
	}
	public void setIdRoll(int idRoll) {
		IdRoll = idRoll;
	}
	public String getNombreRoll() {
		return NombreRoll;
	}
	public void setNombreRoll(String nombreRoll) {
		NombreRoll = nombreRoll;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
}
