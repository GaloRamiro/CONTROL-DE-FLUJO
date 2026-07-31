package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante e = new Estudiante("Galo");
		e.calificar(7);
		System.out.println("==================== EJERCICIO 2 ====================");
		System.out.println("Nombre: "+e.getNombre());
		System.out.println("Nota: "+e.getNota());
		System.out.println("Resultado: "+e.getResultado());
	}

}
