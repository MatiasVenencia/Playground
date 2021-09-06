package main;

import colecciones.pila.Pila;
import colecciones.pila.PilaArregloFijo;
//TODO: importar otras implementaciones de pilas para probar.

/**
* La clase {@code SimbolosBalanceados} implementa una aplicación simple para evaluar si una secuencia de símbolos (paréntesis, corchetes, y llaves) están balanceados, utilizando el TAD {@code Pila}.
* Esta clase usa parámetros que representan los símbolos para evaluar el balance.
* @see colecciones.pila.Pila
* @see colecciones.pila.PilaArregloFijo
* @version 1.0
*/
public class SimbolosBalanceados {

	/*
	* Constantes con los símbolos a utilizar.
	*/
	private static final char IPAREN = '(';
	private static final char DPAREN = ')';
	private static final char ICOR = '[';
	private static final char DCOR = ']';
	private static final char ILLAVE = '{';
	private static final char DLLAVE = '}'; 

	/**
	* Dada una secuencia de símbolos (paréntesis, corchetes, y llaves), se deben imprimir {@code True} ó {@code False} si los símbolos están balanceados o no respectivamente, utilizando el TAD {@code Pila}.
	* Ejemplo de uso: 
	* <ul>
	* 	<li>Al ejecutar <pre>java main.SimbolosBalanceados [()][()()]()</pre>, se debe imprimir {@code True}.</li>
	* 	<li>Al ejecutar <pre>java main.SimbolosBalanceados [(])</pre>, se debe imprimir {@code False}.</li>
	* </ul>
	* @param args : los números a invertir.
	*/
	public static void main(String[] args) {
		Pila<Character> pilaEnteros = new PilaArregloFijo<>();
		for (String argumento : args) {
			/*TODO: completar:
			* 1. Cada argumento debe ser una cadena de tamaño 1.
			* 2. Debe corresponder a un caractér descripto por las constantes IPAREN, DPAREN, ICOR, DCOR, ILLAVE, o DLLAVE.
			* 3. Hay libertad sobre que hacer si el caractér no es un símbolo definido por las constantes anteriores (ignorarlo o arrojar una excepción).
			*/
		
		}
		//TODO: completar
	}
	
	/*
	* Dado un caractér, retorna true sii es uno de los símbolos definidos por las constantes IPAREN, DPAREN, ICOR, DCOR, ILLAVE, o DLLAVE.
	*/
	private static boolean esSimboloAceptado(char simbolo) {
		throw new UnsupportedOperationException("Este método debe retornar true si simbolo es un caractér que corresponde a alguno de los símbolos a utilizar");
	}

}
