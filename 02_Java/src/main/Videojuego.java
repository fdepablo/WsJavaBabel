package main;

import entidad.Prueba;

//Estructura javabean
public class Videojuego {
	private String titulo;//Las referencias se inicializan a null
	private int nota;//los primitivos se inicializan a 0
	private Compania compania;
	
	//El ciclo de vida de los atributos normales o dinamicos
	//estan ligados al ciclo de vida de un objeto
	
	//Tenemos tambien atributos estaticos o NO dinamicos
	//El ciclo de vida de un atributo estatico es todo el ciclo
	//de vida del programa. Realmente un atributo estico NO esta
	//ligado a un objeto. Podemos entenderlo que es un atributo
	//que se compartira por todos los objetos
	
	public static int numeroVideojuegos;
	private static Compania companiaMadre = new Compania();
	
	public Videojuego() {
		super();
		numeroVideojuegos++;
	}
	
	public static Compania getCompaniaMadre() {
		Videojuego v = new Videojuego();
		System.out.println(v.titulo);
		return companiaMadre;
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
	
	public static void crearVideojuego() {
		Videojuego v1 = new Videojuego();
		v1.setTitulo("Mario");
		//this.titulo = "Mario";
	}

	//Para sobrescribir un metodo tiene que tener LA MISMA firma
	@Override
	//La anotacion override es una anotación que comprueba en tiempo
	//de compilación que efectivamente este metodo tiene la misma
	//firma que el padre
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", nota=" + nota + ", compania=" + compania + "]";
	}


}
