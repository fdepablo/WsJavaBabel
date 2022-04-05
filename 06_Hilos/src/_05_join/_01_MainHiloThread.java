
package _05_join;

public class _01_MainHiloThread {

	public static void main(String[] args) {
		
		_01_HiloThread hilo1 = new _01_HiloThread("Valor 1");
		hilo1.setName("Hilo1");
		
		_01_HiloThread hilo2 = new _01_HiloThread("Valor 2");
		hilo2.setName("Hilo2");
				
		hilo1.start();		
		hilo2.start();
		
		//Es posible que en algunos casos queramos esperar a que acaben
		//algunos hilos antes de seguir con la ejecución de otro hilo
		
		try {
			//El método join hace que el hilo que este pasando por este 
			//método se quede en espera hasta que el el hilo asociado
			//al método muera
			hilo1.join();//El hilo main va a esperar hasta que hilo1 muera
			hilo2.join();//El hilo main va a esperar hasta que hilo2 muera
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("El valor calculado del hilo1 es: " + hilo1.getResultado());
		System.out.println("El valor calculado del hilo2 es: " + hilo2.getResultado());
			
	}
	
}
