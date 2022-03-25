package entidad;

public class Coche implements Movible{
	private String marca;
	private String modelo;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public void moverse() {
		System.out.println("Piso el acelerador y me muevo un monto de metros!!!");
		
	}
	
	
}
