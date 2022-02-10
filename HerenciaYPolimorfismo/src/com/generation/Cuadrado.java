package com.generation;


//extends marca de donde se esta heredando /FiguraGemetrica es la super clase y Cuadrado es la hija/
public class Cuadrado extends FiguraGeometrica {
	
	public Cuadrado() {
		super("Cuadrado");
	}

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return getAlto() * getLargo();
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return (getAlto() + getAlto()) * 2;
	}
	
}
