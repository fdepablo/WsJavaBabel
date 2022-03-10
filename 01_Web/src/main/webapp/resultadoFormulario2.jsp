<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Un JSP es un SERVLET -->
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="css/estilos.css">
</head>
<body>
	<h1>Bienvenidos a nuestro primer JSP</h1>
	<!-- Scriptlets (Esta manera NO la recomiendo) -->
	<%
		String nombre = request.getParameter("nombre");
		String mensaje = (String) request.getAttribute("m1");
	%>
	
	<h2><%=nombre %></h2>
	<h2><%=mensaje %></h2>
	
	<hr/>
	<!--  Mejor hacerlo de la siguiente manera 
		Podemos acceder directamente a los atributos mediante ${CLAVE_ATRIBUTO}
	-->
	<h2>${m1}</h2>
		<!--  Mejor hacerlo de la siguiente manera 
		Podemos acceder a los parametros mediante ${param.CLAVE_PARAMETRO}
	-->
	<h2>${param.nombre}</h2>
	<hr/>
	<h2>${numero}</h2>
	<h2>${p1}</h2><!-- Ejecutar el metodo toString() -->
	<hr/>
	<table border=1>
		<tr>
			<th>Nombre</th>
			<th>Apellidos</th>
			<th>Peso</th>
		</tr>
		<tr>
			<td>${p1.nombre}</td>
			<td>${p1.apellidos}</td>
			<td>${p1.peso}</td>
		</tr>
	</table>
</body>
</html>