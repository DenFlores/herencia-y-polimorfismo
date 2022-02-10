package com.generation.animales;

public class Gato extends Animal implements Mascota, Jugar{
	@Override
	public void jugar() {
		System.out.println("Estoy jugando con la caja");
		
	}
	
	@Override
	public void correr() {
		System.out.println("Estoy persiguiendo un ratón");
		
	}
	@Override
	public void baniar() {
		System.out.println("Me gusta lamer a mis amigos");
	}
	
	@Override
	public void moverLaColita() {
		
	}
	
	@Override
	public void jugarConCajas() {
		
	}
	
	
	
	

}
