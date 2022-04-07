package main;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class MainMaven {

	public static void main(String[] args) {
		System.out.println("Hola Mundo Maven");

		List<String> listaStrings = new ArrayList<String>();
		listaStrings.add("Esto");
		listaStrings.add("es Maven");
		
		listaStrings.forEach(s -> System.out.println(s));
		
		Gson gson = new Gson();
	}

}
