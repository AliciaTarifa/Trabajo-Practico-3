/**
 * 
 */
package Ejercicios;

import java.util.Random;

/**
 * @author alicia
 *
 */
public class Ejercicio_13 {

	/**
	 * @param args
	 * Crear un m�todo que reciba un n�mero, si el numero esta entre 1 y 100, el m�todo debe devolver 
	 * un n�mero 1, en otro caso debe devolver 0. Los datos para probar este m�todo deben ser ingresados en el main.
	 */
	public static void main(String[] args) {
		int numero;
				
		Random rdm = new Random();
		numero = rdm.nextInt(200);
		int resultado = nroEntre1y100(numero);
		
		System.out.println("El resultado del n�mero " + numero + " es: " + resultado);

	}
	public static int nroEntre1y100(int nro) {
		if (nro >1 && nro < 100) {
			return 1;
		} else {
			return 0;
		}
		}

}
