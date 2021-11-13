package com.SEII.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Intentos")
public class Intentos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IdIntentos")
	private int IdIntentos;
	
	@Column(name = "IdUsuario")
	private String IdUsuario;
	
	@Column(name = "Fecha")
	private String Fecha;
	
	@Column(name = "Hora")
	private String Hora;
	
	@Column(name = "Pregunta1")
	private String Pregunta1;
	
	@Column(name = "Pregunta2")
	private String Pregunta2;
	
	@Column(name = "Pregunta3")
	private String Pregunta3;
	
	@Column(name = "Pregunta4")
	private String Pregunta4;
	
	@Column(name = "Pregunta5")
	private String Pregunta5;
	
	@Column(name = "Pregunta6")
	private String Pregunta6;
	
	@Column(name = "Pregunta7")
	private String Pregunta7;
	
	@Column(name = "Pregunta8")
	private String Pregunta8;
	
	@Column(name = "Pregunta9")
	private String Pregunta9;
	
	@Column(name = "Pregunta10")
	private String Pregunta10;
	
	@Column(name = "Respuesta1")
	private String Respuesta1;
	
	@Column(name = "Respuesta2")
	private String Respuesta2;
	
	@Column(name = "Respuesta3")
	private String Respuesta3;
	
	@Column(name = "Respuesta4")
	private String Respuesta4;
	
	@Column(name = "Respuesta5")
	private String Respuesta5;
	
	@Column(name = "Respuesta6")
	private String Respuesta6;
	
	@Column(name = "Respuesta7")
	private String Respuesta7;
	
	@Column(name = "Respuesta8")
	private String Respuesta8;
	
	@Column(name = "Respuesta9")
	private String Respuesta9;
	
	@Column(name = "Respuesta10")
	private String Respuesta10;

	public Intentos(int idIntentos, String idUsuario, String fecha, String hora, String pregunta1, String pregunta2,
			String pregunta3, String pregunta4, String pregunta5, String pregunta6, String pregunta7, String pregunta8,
			String pregunta9, String pregunta10, String respuesta1, String respuesta2, String respuesta3,
			String respuesta4, String respuesta5, String respuesta6, String respuesta7, String respuesta8,
			String respuesta9, String respuesta10) {
		IdIntentos = idIntentos;
		IdUsuario = idUsuario;
		Fecha = fecha;
		Hora = hora;
		Pregunta1 = pregunta1;
		Pregunta2 = pregunta2;
		Pregunta3 = pregunta3;
		Pregunta4 = pregunta4;
		Pregunta5 = pregunta5;
		Pregunta6 = pregunta6;
		Pregunta7 = pregunta7;
		Pregunta8 = pregunta8;
		Pregunta9 = pregunta9;
		Pregunta10 = pregunta10;
		Respuesta1 = respuesta1;
		Respuesta2 = respuesta2;
		Respuesta3 = respuesta3;
		Respuesta4 = respuesta4;
		Respuesta5 = respuesta5;
		Respuesta6 = respuesta6;
		Respuesta7 = respuesta7;
		Respuesta8 = respuesta8;
		Respuesta9 = respuesta9;
		Respuesta10 = respuesta10;
	}
	public Intentos() {
	}
	public int getIdIntentos() {
		return IdIntentos;
	}
	public void setIdIntentos(int idIntentos) {
		IdIntentos = idIntentos;
	}
	public String getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String getHora() {
		return Hora;
	}
	public void setHora(String hora) {
		Hora = hora;
	}
	public String getPregunta1() {
		return Pregunta1;
	}
	public void setPregunta1(String pregunta1) {
		Pregunta1 = pregunta1;
	}
	public String getPregunta2() {
		return Pregunta2;
	}
	public void setPregunta2(String pregunta2) {
		Pregunta2 = pregunta2;
	}
	public String getPregunta3() {
		return Pregunta3;
	}
	public void setPregunta3(String pregunta3) {
		Pregunta3 = pregunta3;
	}
	public String getPregunta4() {
		return Pregunta4;
	}
	public void setPregunta4(String pregunta4) {
		Pregunta4 = pregunta4;
	}
	public String getPregunta5() {
		return Pregunta5;
	}
	public void setPregunta5(String pregunta5) {
		Pregunta5 = pregunta5;
	}
	public String getPregunta6() {
		return Pregunta6;
	}
	public void setPregunta6(String pregunta6) {
		Pregunta6 = pregunta6;
	}
	public String getPregunta7() {
		return Pregunta7;
	}
	public void setPregunta7(String pregunta7) {
		Pregunta7 = pregunta7;
	}
	public String getPregunta8() {
		return Pregunta8;
	}
	public void setPregunta8(String pregunta8) {
		Pregunta8 = pregunta8;
	}
	public String getPregunta9() {
		return Pregunta9;
	}
	public void setPregunta9(String pregunta9) {
		Pregunta9 = pregunta9;
	}
	public String getPregunta10() {
		return Pregunta10;
	}
	public void setPregunta10(String pregunta10) {
		Pregunta10 = pregunta10;
	}
	public String getRespuesta1() {
		return Respuesta1;
	}
	public void setRespuesta1(String respuesta1) {
		Respuesta1 = respuesta1;
	}
	public String getRespuesta2() {
		return Respuesta2;
	}
	public void setRespuesta2(String respuesta2) {
		Respuesta2 = respuesta2;
	}
	public String getRespuesta3() {
		return Respuesta3;
	}
	public void setRespuesta3(String respuesta3) {
		Respuesta3 = respuesta3;
	}
	public String getRespuesta4() {
		return Respuesta4;
	}
	public void setRespuesta4(String respuesta4) {
		Respuesta4 = respuesta4;
	}
	public String getRespuesta5() {
		return Respuesta5;
	}
	public void setRespuesta5(String respuesta5) {
		Respuesta5 = respuesta5;
	}
	public String getRespuesta6() {
		return Respuesta6;
	}
	public void setRespuesta6(String respuesta6) {
		Respuesta6 = respuesta6;
	}
	public String getRespuesta7() {
		return Respuesta7;
	}
	public void setRespuesta7(String respuesta7) {
		Respuesta7 = respuesta7;
	}
	public String getRespuesta8() {
		return Respuesta8;
	}
	public void setRespuesta8(String respuesta8) {
		Respuesta8 = respuesta8;
	}
	public String getRespuesta9() {
		return Respuesta9;
	}
	public void setRespuesta9(String respuesta9) {
		Respuesta9 = respuesta9;
	}
	public String getRespuesta10() {
		return Respuesta10;
	}
	public void setRespuesta10(String respuesta10) {
		Respuesta10 = respuesta10;
	}


}