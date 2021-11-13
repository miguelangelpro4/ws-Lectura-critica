package com.SEII.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Preguntas")
public class Preguntas {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdPreguntas")
	private int IdPreguntas;
	
    @Column(name = "Pregunta")
	private String Pregunta;
    
    @Column(name = "Opcion1")
	private String Opcion1;
	
    @Column(name = "Opcion2")
	private String Opcion2;
	
    @Column(name = "Opcion3")
	private String Opcion3;
	
    @Column(name = "Respuesta")
	private String Respuesta;
	
	public Preguntas(int idPreguntas, String pregunta, String opcion1, String opcion2, String opcion3,
			String respuesta) {
		IdPreguntas = idPreguntas;
		Pregunta = pregunta;
		Opcion1 = opcion1;
		Opcion2 = opcion2;
		Opcion3 = opcion3;
		Respuesta = respuesta;
	}
	
	public Preguntas() {
	}

	public int getIdPreguntas() {
		return IdPreguntas;
	}

	public void setIdPreguntas(int idPreguntas) {
		IdPreguntas = idPreguntas;
	}

	public String getPregunta() {
		return Pregunta;
	}

	public void setPregunta(String pregunta) {
		Pregunta = pregunta;
	}

	public String getOpcion1() {
		return Opcion1;
	}

	public void setOpcion1(String opcion1) {
		Opcion1 = opcion1;
	}

	public String getOpcion2() {
		return Opcion2;
	}

	public void setOpcion2(String opcion2) {
		Opcion2 = opcion2;
	}

	public String getOpcion3() {
		return Opcion3;
	}

	public void setOpcion3(String opcion3) {
		Opcion3 = opcion3;
	}

	public String getRespuesta() {
		return Respuesta;
	}

	public void setRespuesta(String respuesta) {
		Respuesta = respuesta;
	}
	
}