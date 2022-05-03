/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_11 {

	/**
	 * @param args
	 * Crear un método que reciba dos números reales este método debe devolver la multiplicación 
	 * entre esos dos números.  Los números para probar este método deben ser ingresados en el main
	 */
	public static void main(String[] args) {
		double x = 54.9;
		double y = 23.3;
		
		double result = multiplicar (x , y);
		System.out.println("El resultado de " + x + "*" + y + " es igual a: " + result);
	}

	public static double multiplicar(double nrox,double nroy) {
		return nrox*nroy;
	}

}
