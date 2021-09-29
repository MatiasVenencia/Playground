package datos;

/**
* La clase {@code BooleanoPI} es una implementación de la clase abstracta {@code Booleano} mediante enteros.
* Un entero impar se considera como {@code verdadero} y un entero par se considera {@code falso}.
*/
public class BooleanoPI extends Booleano {

	private int valor;
	
	/**
	* Construye el valor {@code verdadero}.
	* @return un {@code BooleanoPI} que representa {@code verdadero}
	*/
	public static BooleanoPI verdadero() {
		return new BooleanoPI(1);
	}
	
	/**
	* Construye el valor {@code falso}.
	* @return un {@code BooleanoPI} que representa {@code falso}
	*/
	public static BooleanoPI falso() {
		return new BooleanoPI(0);
	}
	
	private BooleanoPI(int valor) {
		this.valor = valor;
	}

	@Override
	public void negacion() {
		throw new UnsupportedOperationException("Implementar");
	}
	
	@Override
	public void conjuncion(Booleano otro) {
		throw new UnsupportedOperationException("Implementar");
	}
	
	@Override
	boolean evaluar() {
		return valor % 2 == 1;
	}
	
	private BooleanoPI aBooleanoPI(Booleano otro) {
		return otro.evaluar()?verdadero():falso();
	}
	
	@Override
	public boolean repOk() {
		return true;
	}
	
	@Override
	public boolean equals(Object otro) {
		throw new UnsupportedOperationException("Implementar");
	}

}
