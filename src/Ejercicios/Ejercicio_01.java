/**
 * 
 */
package Ejercicios;



/**
 * @author alicia
 *Crear un array de 10 de n�meros enteros con valores solicitados por teclado. Mostrar por consola
 *el �ndice y el valor de cada elemento. Realizar dos m�todos, uno para el ingreso de datos y otro
 *para la salida de datos.
 */
public class Ejercicio_01 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
	int[] enteros = {30,17,3,20,5,16,6,14,88,41};
	for (int i=0; i<enteros.length; i++) {
		System.out.println("En posici�n " + i + " est� el n�mero " + enteros [i]);
	}
	
	
	}
}