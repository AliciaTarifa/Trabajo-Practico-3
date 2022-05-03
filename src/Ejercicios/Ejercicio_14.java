/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author alicia
 *
 */
public class Ejercicio_14 {

	/**
	 * @param args
	 * }Crear un método que permita ingresar un número, determinar si el número es positivo, negativo o cero. 
	 * En el caso que corresponda devolver “Positivo” “negativo” o “cero”. El número es ingresado en el main.
	 */
	public static void main(String[] args) {
		int numero;
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Ingrese un número entre -10 y 10: ");
		numero = scr.nextInt();
		
		String result = EsPositivoNegativoo0(numero);
		
		System.out.println("El número " + numero + " es: " + result);
		scr.close();

	}
	public static String EsPositivoNegativoo0 (int num){
		if (num > 0) {
			return "Es positivo";
		}else if (num < 0){
			return "Es negativo";
		} else {
			return "es 0"; 
		}
		
	}

}
