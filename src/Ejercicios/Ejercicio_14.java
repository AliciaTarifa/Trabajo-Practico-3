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
	 * }Crear un m�todo que permita ingresar un n�mero, determinar si el n�mero es positivo, negativo o cero. 
	 * En el caso que corresponda devolver �Positivo� �negativo� o �cero�. El n�mero es ingresado en el main.
	 */
	public static void main(String[] args) {
		int numero;
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Ingrese un n�mero entre -10 y 10: ");
		numero = scr.nextInt();
		
		String result = EsPositivoNegativoo0(numero);
		
		System.out.println("El n�mero " + numero + " es: " + result);
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
