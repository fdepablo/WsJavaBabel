package entidad;

//Un enumerado es una clase que NO se puede instanciar y que tiene
//los objetos creados al principio del programa
//Los objetos se crean dentro de la clase enumerada
public enum TipoAgua {
	
	//La clase tipo de agua SOLO va a tener los objetos aqui definidos
	
	//DULCE invoca al constructor por defecto
	//SALADA invoca al constructor con parametros
	DULCE("FRIA"), SALADA("CALIENTE");
	
	private String temperatura;

	private TipoAgua(String temperatura) {
		
	}
	
	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	
	
}
