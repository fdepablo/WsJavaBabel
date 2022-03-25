package entidad;

public class Tiburon extends Pez{

	@Override
	public void comer(Object comida) {
		if(comida instanceof Pez) {
			Pez pez = (Pez)comida;
			System.out.println("Soy el tiburon " + nombre + " y me voy a comer"
					+ " al pez " + pez.nombre);
			double gordura = pez.getPeso();
			this.setPeso(this.getPeso() + gordura); 
		}else {
			System.out.println("Los tiburones solo comemos peces :(");
		}
	}
	
	
}
