package main;

import entidad.Prueba;

public class MainJava {
	
	public static void main(String[] args) {
		Prueba prueba = new Prueba();
		prueba.pruebaEntidad = 34;
		
		otropaquete.Prueba pruebaOtroPaquete = new otropaquete.Prueba();
		pruebaOtroPaquete.pruebaOtroPaquete = 34;
		
		//Creamos 
		Videojuego v1 = new Videojuego();
		v1.setNota(10);
		v1.setTitulo("Sonic");
		System.out.println(v1.getNota());
		
		//Mientras haya una referencia apuntando al objeto, el objeto vivira
		Videojuego v2 = v1;
		//Videojuego v3 = new Videojuego();
		
		int numero = 10;
		
		v2.setNota(0);
		System.out.println(v1.getNota());//0 0 / 10 0 / 0 10
		System.out.println(v2.getNota());//6   -   3   -   0
		
		cambiarNotaACinco(v1);
		System.out.println(v2.getNota());//0   /    5
										//0   /     6
		System.out.println(v1.getNota());
		
		//A mano se copian los objetos
		Videojuego v3 = new Videojuego();
		v3.setTitulo(v2.getTitulo());
		v3.setNota(v2.getNota());
		
		cambiarValorACinco(numero);
		System.out.println(numero);//10   /     5
								//4      /      2
		
		Videojuego v4 = cambiarNotaASiete(v1);
		System.out.println(v4.getNota());
		System.out.println(v1.getNota());

		int numero2 = cambiarValorOcho(numero);
		System.out.println(numero2);
		System.out.println(numero);
		
		//Queremos poner un nombre a la compania del videojuego sonic
		Compania c1 = new Compania();
		v1.setCompania(c1);
		v1.getCompania().setNombre("Sega");
		System.out.println(v1.getCompania().getNombre());//Sega
		System.out.println(c1.getNombre());//Sega / null
		
		c1.setDireccion("Calle diamante");
		System.out.println(v2.getCompania().getDireccion());
	}
	
	public static void cambiarNotaACinco(Videojuego v1) {
		v1.setNota(5);
	}
	
	public static void cambiarValorACinco(int numero) {
		numero = 5;
	}
	
	public static Videojuego cambiarNotaASiete(Videojuego v1) {
		v1.setNota(7);
		return v1;
	}
	
	public static int cambiarValorOcho(int numero) {
		numero = 8;
		return numero;
	}
}
