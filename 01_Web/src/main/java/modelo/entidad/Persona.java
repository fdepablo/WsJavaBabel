package modelo.entidad;

//La convención JavaBean dice que los atributos son privados y tiene
//metodos accesores y modificadores para trabajar con ellos

//El metodo accesor empieza por get y luego se pone el atributo en camelcase
//Ej nombre -> getNombre())

//El metodo modifcar empieza por set y luego se pone el atributo en camelcase
//Ej nombre -> setNombre(String nombre)
public class Persona {
	
	private String nombre;
	private String apellidos;
	private int peso;
	
	public Persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", peso=" + peso + "]";
	}
	
	
}
