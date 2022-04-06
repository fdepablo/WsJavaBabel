package _java_11_;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;


//Información sacada de https://www.baeldung.com/java-9-http-client

//https://mkyong.com/
//https://www.arquitecturajava.com/
public class _01_HttpCliente {

	public static void main(String[] args) {

		try {
			//Se utiliza principalmente para consumir servicios REST
			//Tambien podemos consumir cualquier tipo de servidor web
			HttpRequest request = HttpRequest.newBuilder()
					  .uri(new URI("http://localhost:8080/01_Web/PrimerServlet"))
					  .GET()
					  .build();
			
			HttpClient client = HttpClient.newHttpClient();
			
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
			System.out.println(response);
			System.out.println(response.body());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
