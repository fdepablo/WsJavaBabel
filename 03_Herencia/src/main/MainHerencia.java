package main;

import java.util.ArrayList;
import java.util.List;

import entidad.Animal;
import entidad.Coche;
import entidad.Leon;
import entidad.Movible;
import entidad.Pez;
import entidad.Tiburon;
import entidad.TipoAgua;
import entidad.Trucha;

public class MainHerencia {
	public static void main(String[] args) {
		Animal a = null;
		//"".chars();
		//TipoAgua ta = TipoAgua.DULCE;
		//System.out.println(ta.getTemperatura());
		//ta.setTemperatura("TEMPLADA");
		
		Pez p =  new Tiburon();
		p.setNombre("Tiburcio");
		p.setEdad(12);
		p.setNumeroAletas(5);
		p.setPeso(150);
		p.setTipoAgua(TipoAgua.SALADA);
		
		List<Animal> listaAnimales = new ArrayList<Animal>();
		listaAnimales.add(p);
		
		p = new Trucha();
		p.setNombre("Robustiana");
		p.setEdad(2);
		p.setPeso(1);
		p.setTipoAgua(TipoAgua.DULCE);
		
		listaAnimales.add(p);
		
		Leon l = new Leon();
		l.setNombre("Leoncio");
		l.setPeso(200);
		l.setEdad(8);
		
		listaAnimales.add(l);
		
		String plancton = "plancton";
		
		//alimentar a los animales
		for(Animal animal : listaAnimales) {
			System.out.println(animal.toString());
			//aplicamos polimorfismo
			animal.comer(plancton);
			System.out.println(animal.toString());
		}
		
		System.out.println("================================");
		
		a = new Leon();
		a.setNombre("Leon generico 1");
		a.setPeso(100);
		
		//alimentar a los animales
		for(Animal animal : listaAnimales) {
			System.out.println(animal.toString());
			//aplicamos polimorfismo
			animal.comer(a);
			System.out.println(animal.toString());
		}
		
		//Clase anomimas
		//Una clase anonima es un tipo especial de clase la cual
		//se define la clase y el objeto en una misma sentencia.
		//No es necesario declarar la clase y unicamente tendra
		//un objeto asociado
		Animal oso = new Animal() {
			
			private int atributo1;
			
			//supongamos que esto es un oso
			@Override
			public void comer(Object comida) {
				if(comida instanceof Leon) {
					System.out.println("Me como al leon :) " + this.nombre);
				}
				
			}
		};
		
		oso.setNombre("Yogui");
		
		listaAnimales.add(oso);
		
		//alimentar a los animales
		for(Animal animal : listaAnimales) {
			System.out.println(animal.toString());
			//aplicamos polimorfismo
			animal.comer(a);
			System.out.println(animal.toString());
		}
		
		List<Movible> listaMovibles = new ArrayList<Movible>();
		listaMovibles.add(l);
		listaMovibles.add(p);
		Coche coche = new Coche();
		coche.setMarca("seat");
		coche.setModelo("ibiza");
		
		listaMovibles.add(coche);
		
		
		System.out.println("CARRARE");
		
		for(Movible m : listaMovibles) {
			System.out.println(m);
			m.moverse();
		}
		
	}
}
