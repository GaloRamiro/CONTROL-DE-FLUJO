package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto("Teclados", 16.78);

		// probar el metodo setprecio
		p1.setPrecio(-500);
		// Mostarar datos
		System.out.println("==================== EJERCICIO 3 ====================");
		System.out.println("Nombre: " + p1.getNombre());
		System.out.println("Precio: " + p1.getPrecio());
		
		//Prueba metodo calcular descuento 
		System.out.println("Precio con el 20% de descuento: "+p1.calcularPrecioPromo(20));
		
	}

}
