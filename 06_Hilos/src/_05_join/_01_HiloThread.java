package _05_join;


public class _01_HiloThread extends Thread {

	private String valorImprimir;
	private int resultado;

	public _01_HiloThread(String valorImprimir) {
		this.valorImprimir = valorImprimir;
	}

	@Override
	public void run() {
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
		for (int i = 0; i < 20; i++) {

			System.out
					.println("Hilo: " + Thread.currentThread().getName() 
							+ " , dice: " + valorImprimir + " ciclo: " + i);
			resultado = i;
		}
		System.out.println("Hilo: " + Thread.currentThread().getName() + " acabado");
		
	}

	public int getResultado() {
		return resultado;
	}
}
