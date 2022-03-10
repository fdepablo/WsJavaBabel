package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Persona;

/**
 * Servlet implementation class PrimerServlet
 * Un servlet es capaz de procesar peticiones HTTP
 * 
 * Las anotaciones en java proporcinan funcionalidad añadida a nuestros
 * proyectos
 * 
 * ¿Que hace exactamete la anotacion WebServlet?
 * 
 * 1- Da de alta un objeto (y solo uno) de la clase PrimerServlet (Singleton)
 * 2- Mapear dicho objeto a la direccion "/PrimerServlet"
 * 
 * Tomcat ha creado una referencia y un objeto para mantener el objeto de tipo
 * PrimerServlet con vida. Este concepto se llama Inversion de Control, este
 * concepto dice que el programador NO se encarga de mantener el ciclo de vida
 * del objeto, se encarga otra entidad, en este caso Tomcat. Tomcat crea un 
 * objeto de este tipo y lo mantiene en memoria durante toda la ejecución del
 * programa. El programador lo único que hace es programar el objeto.
 */
@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int contador = 0;
       
	//HTTP
	//GET /PrimerServlet http 1.1
	//Cabeceras
	//...
	//
	// BODY	
	
	//Los objetos Request y response tambien son creados mediante IoC, pero en este caso
	//el ciclo de vida que aplica Tomcat a estos objetos es que viviran durante toda
	//una peticion HTTP y luego moriran :( :( :(
	
	//El otro concepto que se aplica aquí, es el de ID (Inyeccion de Dependencias.
	//Este concepto nos dice que cuando necesitemos un objeto para realizar una funcionalidad
	//y no queremos crearlo, podemos pedirle a un ente que nos proporcione dicho objeto
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Si la peticion es GET
		response.getWriter().append("Hola PrimerServlet DoGet " + ++contador).append(request.getContextPath());
		
		//El ciclo de vida de un objeto en java es
		//1 Nace con el new
		//2 Muere cuando se quede desreferenciado
		
		//El ciclo de vida de una referencia es
		//1 Nace cuando se declara
		//2 Muere cuando acaba el bloque donde se declaro
		

		{//Bloque
			Persona p = new Persona();
			p.setNombre("Tony Stark");
			p.getNombre();
		}//aqui morira la referencia, y por lo tanto el objeto quedará
		//desreferenciado y morira en un futuro cuando se pase el GB

		Persona p = new Persona();
		p.getNombre();//esta vacio
		
		if(contador == 100) {
			contador = 0;
		}
	}

	//HTTP
	//POST /PrimerServlet http 1.1
	//Cabeceras
	//...
	//
	// BODY
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Si la petición es POST
		response.getWriter().append("Hola PrimerServlet DoPost "+ ++contador).append(request.getContextPath());
	
		if(contador == 100) {
			contador = 0;
		}
	}

}
