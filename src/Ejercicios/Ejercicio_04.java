/**
 * 
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author alicia
 *
 */
public class Ejercicio_04 {

	/**
	 * @param args
	 * Generar 20 n�meros enteros entre 1 y 100 de forma aleatoria y contar cu�ntos de esos n�meros
	 * enteros son divisibles entre 5.
	 */
	public static void main(String[] args) {
		Random rdm = new Random();
		ArrayList <Integer> n�meros = new ArrayList <Integer>();
		
		for (int i = 0; i<20; i++) {
			int numeroRandom = rdm.nextInt(100);
			if (numeroRandom > 0)
				n�meros.add(numeroRandom);
		}
		int divisor = 0;
		for (int posicion = 0; posicion < n�meros.size(); posicion++) {
			if (n�meros.get(posicion)% 5 == 0){
				divisor ++;
			}
			
		}
		System.out.println("Lista: " + n�meros);
		System.out.println("La cantidad de n�meros divisibles entre 5 es: " + divisor);

	}

}
