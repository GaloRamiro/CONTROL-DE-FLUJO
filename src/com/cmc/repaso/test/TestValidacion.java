package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion v1 = new Validacion();
		System.out.println("==================== EJERCICIO 1 ====================");
		System.out.println("Monto 4.0: " + v1.validarMonto(4.0));
		System.out.println("Monto 0.0: " + v1.validarMonto(0.0));
		System.out.println("Monto -5.5: " + v1.validarMonto(-5.5));
	}

}
