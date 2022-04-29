/**
 * 
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author alicia
 *
 */
public class Ejercicio_05 {

	/**
	 * @param args
	 * Dada una lista de números enteros, separarla en dos listas ordenadas de menor a mayor: 
	 * la primera con los números pares y la segunda con los números impares.
	 */
	public static void main(String[] args) {
		List<Integer> lista = List.of(23, 16, 8, 74, 63, 9, 55, 22, 10, 6, 18, 13, 89, 1).stream().collect(Collectors.toList());
		List<Integer> Pares = new ArrayList<Integer>();
		List<Integer> Impares = new ArrayList<Integer>();
		
		lista.sort(Comparator.naturalOrder());
		for(int posicion = 0; posicion < lista.size(); posicion ++) {
			if (lista.get(posicion)% 2 == 0) {
				Pares.add(lista.get(posicion));
			} else {
				Impares.add(lista.get(posicion));
			}
				
		}
		System.out.println("Lista: " + lista);
		System.out.println("Son números pares: " + Pares);
		System.out.println("Son números impares: " + Impares);

	}

}
