/**
 * 
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author alicia
 *
 */
public class Ejercicio_03 {

	/**
	 * @param args
	 * Crear un vector de 10 n�meros reales, con valores solicitados al usuario. Por otro lado solicitar una posici�n 
	 * entre 0 y 9. Eliminar el elemento situado en esa posici�n sin dejar hueco. Visualizar el vector resultante.
	 */
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int iteracion =0; iteracion < 10; iteracion ++) {
			num.add(scn.nextInt());
		}

		
		System.out.println("El Array ingresado es: " + num);

	    System.out.print("�Qu� posici�n desea eliminar? ");
	    
	    int posicionARemover = scn.nextInt();
	    num.remove(posicionARemover);

	    System.out.println("El Array resultante es: " + num);

	 
		scn.close();
	}

}
