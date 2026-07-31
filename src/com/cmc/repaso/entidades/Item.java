package com.cmc.repaso.entidades;

public class Item {

	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	// Getters
	public String getNombre() {
		return nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	// Método para imprimir el estado del inventario
	public void imprimir() {
		System.out.println("Productos Actuales: " + this.productosActuales);
		System.out.println("Productos Devueltos: " + this.productosDevueltos);
		System.out.println("Productos Vendidos: " + this.productosVendidos);
	}

	// Método para vender productos
	public void vender(int cantidad) {
		this.productosActuales -= cantidad;
		this.productosVendidos += cantidad;
	}

	// Método para registrar devoluciones
	public void devolver(int cantidadDevueltos) {
		this.productosActuales += cantidadDevueltos;
		this.productosVendidos -= cantidadDevueltos;
		this.productosDevueltos += cantidadDevueltos;
	}

}