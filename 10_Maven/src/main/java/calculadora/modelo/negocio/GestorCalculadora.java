package calculadora.modelo.negocio;

public class GestorCalculadora {
	
	private int acumulado;
	
	/**
	 * Metodo que suma dos numeros enteros y devuelve el resultado
	 * @param n1 numero1
	 * @param n2 numero2
	 * @return el resultado de la suma
	 */
	public int sumar(int n1, int n2) {
		return n1 + n2;
	}
	
	public double sumar(double n1, double n2) {
		return n1 + n2;
	}
	
	/**
	 * Metodo que acumula en un atributo el valor pasado por 
	 * parametro
	 * @param n1
	 * @return el valor acumulado
	 */
	public int sumarAcumulado(int n1) {
		acumulado += n1;
		return acumulado;
	}
	
	/**
	 * Metodo que divide 2 numeros y devuelve el resultado
	 * @param numerador
	 * @param denominador
	 * @return el resultado de la division entera (redondeado hacia abajo)
	 * @throws ArimtmeticException si el denominador es igual que 0
	 */
	public int dividir(int numerador, int denominador) {
		return numerador/denominador;
	}
}
