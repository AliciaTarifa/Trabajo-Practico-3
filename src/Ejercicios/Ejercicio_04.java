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
	 * Generar 20 números enteros entre 1 y 100 de forma aleatoria y contar cuántos de esos números
	 * enteros son divisibles entre 5.
	 */
	public static void main(String[] args) {
		Random rdm = new Random();
		ArrayList <Integer> números = new ArrayList <Integer>();
		
		for (int i = 0; i<20; i++) {
			int numeroRandom = rdm.nextInt(100);
			if (numeroRandom > 0)
				números.add(numeroRandom);
		}
		int divisor = 0;
		for (int posicion = 0; posicion < números.size(); posicion++) {
			if (números.get(posicion)% 5 == 0){
				divisor ++;
			}
			
		}
		System.out.println("Lista: " + números);
		System.out.println("La cantidad de números divisibles entre 5 es: " + divisor);

	}

}
