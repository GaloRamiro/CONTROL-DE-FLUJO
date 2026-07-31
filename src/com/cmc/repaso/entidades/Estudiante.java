package com.cmc.repaso.entidades;

public class Estudiante {

	private String nombre;
	private double nota;
	private String resultado;

	// Contructor que recibe nombre
	public Estudiante(String nombre) {
		this.nombre = nombre;

	}

	// Metodo Calificar
	public void calificar(double nota) {
		this.nota = nota;
		if (nota < 8) {
			this.resultado = "F";
		} else {
			this.resultado = "A";
		}
	}

}
