package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Persona;


@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Hay que tener muy claro que los valores de los parámetros llegan siempre
		//en formato cadena (String)
		String nombre = request.getParameter("nombre");//igual que el name del html
		String apellidos = request.getParameter("apellidos");
		String sPeso = request.getParameter("peso");//Si no existe el paramtero, devuelve null
		
		int iPeso = 0;
		if(sPeso != null) {
			iPeso = Integer.parseInt(sPeso);
		}
				
		Persona p = new Persona();
		p.setNombre(nombre);
		p.setApellidos(apellidos);
		p.setPeso(iPeso);
		
		//Con el objeto response trabajamos con todo lo referente a la respuesta
		//HTTP
		response.getWriter().append("<h1 style='color: red'>" + p.toString() + "</h1>");
		response.setContentType("text/html");
		//Si queremos trabajar con HTML, esta no es la manera
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
