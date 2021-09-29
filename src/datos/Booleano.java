package datos;

/**
* La clase abstract {@code Booleano} representa una valor lógico ({@code true}, {@code false}) y operaciones asociadas.
* Las operaciones ofrecidas por cualquier implementación de esta clase son:
* <ul>
*   <li> disyuncion		: aplica la disyunción lógica entre un booleano y otro, modificando el primero.</li>
*   <li> conjuncion		: aplica la conjunción lógica entre un booleano y otro, modificando el primero.</li>
*   <li> negacion		: aplica la negación lógica a un booleano, modificando al mismo.</li>
*   <li> disyuncion		: aplica la implicación lógica entre un booleano y otro, modificando el primero.</li>
*   <li> evaluar(paquete)	: permite evaluar un booleano y obtener un valor boolean, solo utilizado por las implementaciones.</li>
*   <li> repOK			: Permite validar si una instancia satisface el invariante de representación.</li>
*   <li> toString		: Retorna una representación en forma de cadena.</li>
*   <li> equals			: Permite evaluar si otra instancia de booleano es igual a esta.</li>
* </ul>
* @version 1.0
*/
public abstract class Booleano {

	/**
	* Aplica la negación lógica a este booleano.
	*/
	public abstract void negacion();
	
	/**
	* Aplica la disyunción entre este booleano y otro, modificando a este con el resultado.
	* @param otro el otro disyunto 
	*/
	public void disyuncion(Booleano otro) { //"a o b" es equivalente a "no ((no a) y (no b))"
		negacion(); 		//no a
		otro.negacion(); 	//no b
		conjuncion(otro);	//no a y no b
		negacion();		//no ((no a) y (no b))
	}
	
	/**
	* Aplica la conjunción entre este booleano y otro, modificando a este con el resultado.
	* @param otro el otro conyunto 
	*/
	public abstract void conjuncion(Booleano otro);
	
	/**
	* Aplica la implicación entre este booleano y otro, siendo este booleano el antecedente, modificando a este con el resultado.
	* @param otro el consecuente de la implicación 
	*/
	public void implicacion(Booleano otro) { //puede definirse en base a la negación y la disyunción : "a implica b" es equivalente a "no (a) o b"
		negacion();
		disyuncion(otro);
	}
	
	/**
	* Permite evaluar este booleano como un valor {@code boolean}.
	* Este método debe ser utilizado solo por las implementaciones de esta interface.
	*/
	abstract boolean evaluar();
	
	/**
	* Invariante de clase.
	* @return {@code true} sii el booleano satisface su invariante de clase
	*/
	public abstract boolean repOk();
	
	@Override
	public String toString() {
		return String.valueOf(evaluar());
	}
	
	@Override
	public boolean equals(Object otro) {
		if (otro == null)
			return false;
		if (!(otro instanceof Booleano))
			return false;
		Booleano otroComoBooleano = (Booleano) otro;
		return evaluar() == otroComoBooleano.evaluar();
	}

}
