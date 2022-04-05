package _04_lambdas;

import java.util.ArrayList;
import java.util.List;

public class MainAlmacen {
	public static void main(String[] args) {
		AlmacenObjetos ao = new AlmacenObjetos();
		ao.setO("String");
		ao.setO(5);
		//ao.setO(new Coche());
		
		int numero = (Integer)ao.getO();
		System.out.println(numero);
		
		//Operador diamante desde la 1.7. Usado para generics
		//Si no ponemos el tipo en la creacion del objeto
		//coje el mismo tipo que en la declaración de la referencia
		Almacen<String> a = new Almacen<>();
		a.setO("cadena");
		String s = a.getO();
		System.out.println(s);
		
		Almacen<Integer> ai = new Almacen<>();
		ai.setO(5);
		numero = ai.getO();
		
		/*
		List listaObject = new ArrayList();
		listaObject.add("String");
		listaObject.add(34);*/
	}
}
