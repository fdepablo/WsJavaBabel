package _java_10_;

import java.util.Scanner;
import java.util.function.Consumer;

//'var' nacio en java 10 y la idea es no declarar
//el tipo de variable en tiempo de compilación, sino crearla en tiempo
//de ejecución. Es lo que se llama "inferencia de tipos"
public class _01_Var {
	
	//No podemos usar var para atributos de clase
	//var propiedades = 5;
	int propiedad = 9;
	
	public static void main(String[] args) {
		
		String s = "Esto es un string";//aqui decimos el tipo en tiempo de compilacion
		var s2 = "Esto es un string";//aqui decimos el tipo en tiempo de ejecución
		
		//Error en tiempo de compilacion
		//s2 = 6;
				
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		System.out.println(numero);
		
		var numero2 = sc.nextInt();
		var numero3 = sc.next();
		//numero2 = sc.next();
		
		var c2 = getObject();//String
		
		
		String c3 = getObject();
		
		Consumer<String> c = v -> {
			//Java 11
			String c4 = getObject();
			var c5 = getObject();
		};
	}
	
	public static String getObject() {
		return "esto es una cadena";
	}
}
