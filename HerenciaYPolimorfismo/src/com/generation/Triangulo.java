package com.generation;

public class Triangulo extends FiguraGeometrica {
	public Triangulo() {
		super("Triangulo");
		
	}
	//es un metodo al que le vas a aplicar polimorfismo
		@Override
		public float calcularArea() {
			return (getAlto() * getLargo())  / 2;
		}
		@Override
		public float perimetro() {
			return (getAlto()); 
		}



}
