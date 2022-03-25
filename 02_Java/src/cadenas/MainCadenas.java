package cadenas;

import java.util.Scanner;

import main.Videojuego;

public class MainCadenas {

	public static void main(String[] args) {
		
		String s1 = "pepe";
		String s2 = "pepe";
		
		if(s1 == s2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		
		String s3 = new String("pepe");
		String s4 = new String("pepe");
		
		if(s3 == s4) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		int n1 = 5;
		int n2 = 5;
		System.out.println(n1 == n2);
		
		if(s2 == s4) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		if(s1 == s3) {
			System.out.println("Son iguales s1 s3");
		}else {
			System.out.println("Son diferentes s1 s3");
		}

		if(s2.equals(s4)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre:");
		String nombre = sc.nextLine();
		if(nombre.equals("pepe")) {//Siempre compara el ESTADO de los string
			System.out.println("hola pepe");
		}else {
			System.out.println("No soy pepe");
		}
		
		s1 = s1 + " lucia";
		
		Object o = "puedo?? may i???";
		o = new Videojuego();
		o = new int[6];
		
		o = new Integer(3);

	}

}
