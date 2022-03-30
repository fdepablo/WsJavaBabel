package entidad;

public class Main {

	public static void main(String[] args) {
		Guerrero g1 = new Guerrero();
		g1.setNombre("Conan");
		Arma espada = new Espada();
		g1.setArma(espada);
		g1.atacar();
		Arma arco = new Arco();
		g1.setArma(arco);
		g1.atacar();
	}

}
