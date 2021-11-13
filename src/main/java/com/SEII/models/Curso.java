package com.SEII.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdCurso")
	private long IdCurso;

    @Column(name = "Grado")
	private String Grado;
    
    @Column(name = "Grupo")
	private String Grupo;
    
	public Curso(int idCurso, String grado, String grupo) {
		IdCurso = idCurso;
		Grado = grado;
		Grupo = grupo;
	}
	public Curso() {
	}
	public long getIdCurso() {
		return IdCurso;
	}
	public void setIdCurso(int idCurso) {
		IdCurso = idCurso;
	}
	public String getGrado() {
		return Grado;
	}
	public void setGrado(String grado) {
		Grado = grado;
	}
	public String getGrupo() {
		return Grupo;
	}
	public void setGrupo(String grupo) {
		Grupo = grupo;
	}
}
