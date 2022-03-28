package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entidad.Persona;

public class EscribirFicheroAutoclosable {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.dni = "323232332";
		
		File file = new File("persona.dat");
		
		//Caracteristica de java 1.7, bloque autoclose. Los objetos
		//que hayan dentro de los parentesis del try, se ejecutaran
		//automaticamente su método close cuando se acabe el bloque
		//try/catch
		try(FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos =  new ObjectOutputStream(fos);) {
			oos.writeObject(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
