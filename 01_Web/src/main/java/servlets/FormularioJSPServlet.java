package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Persona;

@WebServlet("/FormularioJSPServlet")
public class FormularioJSPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Estoy entrando al servlet??");
		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String sPeso = request.getParameter("peso");
		
		int iPeso = 0;
		if(sPeso != null && !sPeso.equals("")) {
			iPeso = Integer.parseInt(sPeso);
		}
				
		Persona p = new Persona();
		p.setNombre(nombre);
		p.setApellidos(apellidos);
		p.setPeso(iPeso);
		
		String mensaje = "Primer mensaje desde el Servlet";
		
		//Pododemos decir al servlet donde queremos ir para mostrar la información
		RequestDispatcher rd = request.getRequestDispatcher("resultadoFormulario2.jsp");
		request.setAttribute("m1", mensaje);
		request.setAttribute("numero", 5);
		request.setAttribute("p1", p);
		
		//Si quereis guardar información para un usuario durante todo su traye
		//cto por la app, debéis usar la Session
		request.getSession().setAttribute("nombre", nombre);
		//Ejecutamos la accion de ir
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
