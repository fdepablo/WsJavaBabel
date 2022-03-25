package entidad;

import java.io.Serializable;

public abstract class Animal implements Movible, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	protected String nombre;
	private double peso;
	private int edad;
	
	public abstract void comer(Object comida);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso < 0) {
			this.peso = 0;
		}else {
			this.peso = peso;
		}		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + "]";
	}

	@Override
	public void moverse() {
		System.out.println("Me muevo 1 metro");
		
	}
	
	
}
