package com.SEII.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ParametrosConfig")
public class ParametrosConfig {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdParrametros")
	private int IdParrametros;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	@Column(name = "Valor")
	private String Valor;
	
	@Column(name = "Descripcion")
	private String Descripcion;
	
	@Column(name = "Estado")
	private String Estado;
	
	public ParametrosConfig(int idParrametros, String nombre, String Valor, String descripcion, String estado) {
		IdParrametros = idParrametros;
		Nombre = nombre;
		this.Valor = Valor;
		Descripcion = descripcion;
		Estado = estado;
	}
	public ParametrosConfig() {
	}
	public int getIdParrametros() {
		return IdParrametros;
	}
	public void setIdParrametros(int idParrametros) {
		IdParrametros = idParrametros;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String Valor) {
		this.Valor = Valor;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}

}
