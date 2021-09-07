package datos;

/**
* La interface {@code Racional} representa un número racional, formado por un numerador y un denominador enteros.
* 
* Las operaciones ofrecidas por cualquier implementación de esta clase son:
* <ul>
*   <li> sumar		: Suma otro racional a este.</li>
*   <li> multiplicar	: Multiplica otro racional a este.</li>
*   <li> negar		: Niega este racional, equivalente a multiplicar por {@code -1}.</li>
*   <li> dividir	: Divide este racional por otro..</li>
*   <li> repOk		: Permite validar si una instancia satisface el invariante de representación.</li>
*   <li> toString	: Retorna una representación en forma de cadena.</li>
*   <li> equals		: Permite evaluar si otro racional es igual a este.</li>
*   <li> compareTo	: Permite comparar este racional a otro para determinar la relación de orden.</li>
* </ul>
* @version 1.1
*/
public interface Racional extends Comparable<Racional> {

	/**
	* Suma otro racional a este, modificando este racional con el resultado.
	* @param otro el racional a sumar
	*/
	public void sumar(Racional otro);

	/**
	* Multiplica otro racional a este, modificando este racional con el resultado.
	* @param otro el racional a multiplicar
	*/
	public void multiplicar(Racional otro);

	/**
	* Niega este racional, equivalente a multiplicar por {@code -1}, modificando este racional con el resultado.
	*/
	public void negar();

	/**
	* Divide este racional por otro, modificando este racional con el resultado.
	* @param otro el racional por el cual dividir a este
	*/
	public void dividir(Racional otro);

	/**
	* El invariante de represantacion
	* @return {@code true} sii este racional satisface su invariante de clase
	*/
    	public boolean repOk();

	@Override
	public String toString();
	
	@Override
	public boolean equals(Object otro);
	
	@Override
	public int compareTo(Racional otro);

}
