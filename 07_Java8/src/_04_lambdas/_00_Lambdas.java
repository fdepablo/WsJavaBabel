package _04_lambdas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class _00_Lambdas {
	
	@FunctionalInterface
	interface Imprimible{
		void imprimir(String cadena);
	}
	
	static class ImprimirPantalla implements Imprimible{

		@Override
		public void imprimir(String cadena) {
			System.out.println(cadena);			
		}
		
	}
	
	public static void main(String[] args) {
		//Antes de Java 8 podiamos hacer funcionalidad parecida a las funciones
		//lambda mediante clases anonimas
		
		//En este caso voy a crearme una clase anonima cuya funcionalidad
		//sera imprimir por fichero
		Imprimible imprimible = new Imprimible() {
			
			@Override
			public void imprimir(String cadena) {
				File fichero = new File("prueba.txt");
	
				try (FileWriter fw = new FileWriter(fichero)){			
					fw.write(cadena);			
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //un fw.close() de manera implicita
				
			}
		};
		
		imprimible.imprimir("Esto es una cadena escrita con una clase anonima");
		
		imprimible = new ImprimirPantalla();
		imprimible.imprimir("Esto es una cadena escrita con una clase anonima");
		
		//Ahora conn funciones lambda
		Imprimible imprimiblePantallaLambda = s -> System.out.println(s);
		
		Imprimible imprimibleFicheroLambda = cadena -> {
			File fichero = new File("prueba.txt");			
			try (FileWriter fw = new FileWriter(fichero)){			
				fw.write(cadena);			
			} catch (IOException e) {
				e.printStackTrace();
			} 
		};
		
		imprimibleFicheroLambda.imprimir("Ahora imprimo con lambda");
		imprimiblePantallaLambda.imprimir("Ahora imprimo con lambda");
		
		
		//Ejemplo practico de funciones lambda
		List<String> listaPalabras = new ArrayList<String>();
		listaPalabras.add("Felix");
		listaPalabras.add("por favor");
		listaPalabras.add("es viernes");
		listaPalabras.add("ten piedad :( :(");
		
		System.out.println("Manera clasica");
		for(int i = 0; i < listaPalabras.size(); i++) {
			System.out.println(listaPalabras.get(i));
		}
		
		System.out.println(" con for each");
		//1.5 for each
		for(String s : listaPalabras) {
			System.out.println(s);
		}
		
		System.out.println("con lambdas");
		listaPalabras.forEach(s -> System.out.println(s));
		
		System.out.println("con lambdas y varias sentencias");
		listaPalabras.forEach(s -> {
			System.out.print("- ");
			System.out.println(s);
		});
		
		System.out.println("Con consumer");
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("pepe");		
		
		listaPalabras.forEach(consumer);
	}
}

