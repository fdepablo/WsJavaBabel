package calculadora.modelo.negocio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorCalculadoraTest {

	@Test
	void sumarEnterosTest() {
		//Las pruebas unitaris buscan que un método hace lo 
		//dice que hace. Podemos basarnos en la documentación
		//y si no, os tenéis que basar en el código
		
		//El minimo que tenemos que probar son todas las casuisticas
		//del método
		
		//Normalmente las pruebas se basan en comprobar que un
		//resultado esperado coincide con un resultado obtenido
		
		int n1 = 7;
		int n2 = 9;
		
		int esperado = 16;
		
		GestorCalculadora gc = new GestorCalculadora();
		int obtenido = gc.sumar(n1, n2);
		
		//JUNIT nos proporciona aserciones que nos ayudan a comprobar
		//estos resulador esperador con los resultados obtenidos
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void sumarAcumuladoTest() {
		int n1 = 5;
		
		int esperado = 5;
		
		GestorCalculadora gc = new GestorCalculadora();
		int obtenido = gc.sumarAcumulado(n1);
		
		assertEquals(esperado, obtenido);
		
		
		n1 = 10;
		esperado = 15;
		
		obtenido = gc.sumarAcumulado(n1);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void dividirTest() {
		int dividendo = 15;
		int divisor = 3;
		
		int esperado = 5;
		
		GestorCalculadora gc = new GestorCalculadora();
		int obtenido = gc.dividir(dividendo, divisor);
		
		assertEquals(esperado, obtenido);
		
		assertThrows(
				ArithmeticException.class, 
				() -> gc.dividir(15, 0)
		);
		
		dividendo = 15;
		divisor = 2;
		
		esperado = 7;
		
		obtenido = gc.dividir(dividendo, divisor);
		
		assertEquals(esperado, obtenido);
	}

}
