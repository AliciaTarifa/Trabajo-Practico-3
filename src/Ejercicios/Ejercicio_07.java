/**
 * 
 */
package Ejercicios;

import java.util.List;
/**
 * @author alicia
 *
 */
public class Ejercicio_07 {

	/**
	 * @param args
	 * Escriba un programa que determine la cantidad de vocales y consonantes de una palabra.
	 */
	public static void main(String[] args) {
		List <Character> vocales =List.of('a','e','i','o','u');
	List<Character> consonantes = List.of('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z');
	String palabra = "Murcielago";
	int cantidadVocales = 0;
	int cantdadConsonantes = 0;
	
	for (int posicionLetra = 0; posicionLetra<palabra.length();posicionLetra++) {
		if(vocales.contains(palabra.charAt(posicionLetra))) {
		cantidadVocales++;
	}
	if (consonantes.contains(palabra.charAt(posicionLetra))) {
		cantdadConsonantes++;
	
	}
  }
	System.out.println("La cantidad de vocales de '" + palabra + "' es: " + cantidadVocales + " y de consonantes: " + cantdadConsonantes);
 }
}
