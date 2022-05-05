/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author alicia
 *
 */
public class Ejercicio_17 {

	/**
	 * @param args
	 * Crear el método primo que determine si un valor ingresado por el usuario es primo o no para esto 
	 * el método debe devolver un boolean. Suponga que el valor de entrada es ingresado en el main y se 
	 * debe mostrar un mensaje “ES PRIMO ” o “NO ES PRIMO.”
	 */
	public static void main(String[] args) {
		int num;
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		num = scr.nextInt();
		
		if (esPrimo(num)) {
			System.out.println("El número " + num + " es primo");
		} else {
			System.out.println("El número " + num + " no es primo");
		}
		
		scr.close();

	}
	public static boolean esPrimo(int nro) {
		int maxCantDivisores = 2, divisores = 0;
		
		for (int divisor = 1; divisor <= nro; divisor ++) {
			if (nro%divisor == 0) {
				divisores++;
			}
		}
		return divisores == maxCantDivisores;
	}

}
