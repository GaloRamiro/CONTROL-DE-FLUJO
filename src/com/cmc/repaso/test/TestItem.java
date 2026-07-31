package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item i1= new Item();
		System.out.println("==================== EJERCICIO 4 ====================");
		i1.setNombre("Iphon 13 pro max");
		i1.setProductosActuales(20);
		i1.setProductosDevueltos(0);
		i1.setProductosVendidos(0);

		System.out.println("=== Estado inicial ===");
		i1.imprimir();
		System.out.println("\n=== Venta de 5 productos ===");
		i1.vender(5);
		i1.imprimir();
		System.out.println("\n=== Venta de 3 productos ===");
		i1.vender(3);
		i1.imprimir();

		System.out.println("\n=== Devolución de 2 productos ===");
		i1.devolver(2);
		i1.imprimir();

		System.out.println("\n=== Venta de 4 productos ===");
		i1.vender(4);
		i1.imprimir();

		System.out.println("\n=== Devolución de 1 producto ===");
		i1.devolver(1);
		i1.imprimir();
	}

}
