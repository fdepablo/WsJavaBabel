package entidad;

public class Leon extends Animal{

	private static final long serialVersionUID = 1L;

	@Override
	public void comer(Object comida) {
		if(this != comida) {
			if(comida instanceof Animal) {
				Animal a = (Animal)comida;
				System.out.println("Soy el leon " + this.nombre + " y me voy a "
						+ " comer al animal " + a.getNombre());
				double gordura = a.getPeso()/2;
				setPeso(getPeso() + gordura); 
			}else {
				System.out.println("Solo como animales :(");
			}
		}else {
			System.out.println("No me voy a comer a mi mismo");
		}
	}

	@Override
	public void moverse() {
		System.out.println("Me muevo 15 metros");
	}
	
}
