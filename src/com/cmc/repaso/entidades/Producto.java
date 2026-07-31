package com.cmc.repaso.entidades;

public class Producto {
	// Atributos

	private String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	
	public void setPrecio(double precio) {
	    if (precio < 0) {
	        this.precio = precio * -1;
	    } else {
	        this.precio = precio;
	    }
	}
	
	public double calcularPrecioPromo(double porcentaje) {
	    double descuento = precio * porcentaje / 100;
	    return precio - descuento;
	}
}
