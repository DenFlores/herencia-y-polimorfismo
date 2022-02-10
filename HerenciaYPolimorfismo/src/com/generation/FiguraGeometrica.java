package com.generation;

public abstract class FiguraGeometrica {
	//Clases abstractas, clases que pueden o no contener métodos abstractos
	//no sirve para crear objetos, solo hereda la clase
	//privadas se accede solo desde la clase, esta encapsulada, puede contener metodos abstractos
	
	//metodo abstracto, es un metodo que te dice que hacer pero no como hacerlo
	protected String nombre;
	protected float alto;
	protected float largo;

	/*public FiguraGeometrica() {
		
	}*/

	public FiguraGeometrica(String nombre){
		
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public abstract float calcularArea();
	

    public abstract float perimetro(); 
}


		
	
	

