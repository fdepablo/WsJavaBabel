package entidad;

import java.io.Serializable;

public class Persona implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * La encapsulación en java se define en 4 niveles de visibilidad y se
	 * pueden poner en atributos y métodos
	 * 
	 * 1- private, solo podemos acceder desde la propia clase
	 * 2- (default), desde la propia clase y desde las clases dentro del mismo
	 * paquete
	 * 3- protected, desde la propia clase, desde las clases dentro del mismo
	 * paquete y desde las clases que hereden de esta
	 * 4- public, desde cuaquier parte
	 */
	String nombre;
	private int edad;
	protected double peso;
	public String dni;
	
	public void presentarse() {
		System.out.println("Hola soy " + this.nombre);
		System.out.println("Tengo la edad de " + this.edad);
		System.out.println("Tengo el peso de " + this.peso);
	}
}
