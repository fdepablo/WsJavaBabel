package entidad;

public class Guerrero {
	private String nombre;
	private Arma arma;
	
	public Guerrero() {

	}
	
	public void atacar() {
		System.out.println("Argggg!!!");
		System.out.println("Soy " + this.nombre + " y voy a atacar");
		arma.usar();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}


}
