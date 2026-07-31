package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public void imprimir() {
		// System.out.println("Nombre: " + this.nombre);
		System.out.println("Productos Actuales: " + this.productosActuales);
		System.out.println("Productos Devueltos: " + this.productosDevueltos);
		System.out.println("Productos Vendidos: " + this.productosVendidos);
	}

	public void vender(int cantidad) {
		this.productosActuales = this.productosActuales - cantidad;
		this.productosVendidos = this.productosVendidos + cantidad;
	}

	public void devolver(int cantidadDevueltos) {
		this.productosActuales = this.productosActuales + cantidadDevueltos;
		this.productosVendidos = this.productosVendidos - cantidadDevueltos;
		this.productosDevueltos = this.productosDevueltos + cantidadDevueltos;
	}

}
