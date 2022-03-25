package entidad;

public abstract class Pez extends Animal{
	
	private static final long serialVersionUID = 1L;
	
	private TipoAgua tipoAgua;
	private int numeroAletas;
	
	/**
	 * Los peces comen por defecto Plancton
	 * @param comida lo que se va a comer el pez
	 */
	public void comer(Object comida) {
		if(comida instanceof String) {
			String s = (String)comida;
			if(s.equals("plancton")) {
				System.out.println("Soy el animal " + this.nombre + " y voy comer");
				this.setPeso(getPeso() + 0.1); 
			}
		}else {
			System.out.println("No me gusta eso :( :( :(");
		}
				
	}

	public TipoAgua getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(TipoAgua tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public int getNumeroAletas() {
		return numeroAletas;
	}

	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}
	
}
