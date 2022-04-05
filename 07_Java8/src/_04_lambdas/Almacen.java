package _04_lambdas;

public class Almacen<T> {
	private T o;

	public T getO() {
		return o;
	}

	public void setO(T o) {
		this.o = o;
	}
	
	public void imprimir() {
		System.out.println(o.toString());
	}
}
