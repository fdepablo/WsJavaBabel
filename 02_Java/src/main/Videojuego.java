package main;

//Estructura javabean
public class Videojuego {
	private String titulo;//Las referencias se inicializan a null
	private int nota;//los primitivos se inicializan a 0
	private Compania compania;
	
	public Videojuego() {
		super();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		if(nota < 0) {
			this.nota = 0;
		}else {
			this.nota = nota;
		}		
	}

	public Compania getCompania() {
		return compania;
	}

	public void setCompania(Compania compania) {
		this.compania = compania;
	}	
}
