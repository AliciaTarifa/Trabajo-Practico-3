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
	 * Crear un m�todo que reciba dos n�meros reales este m�todo debe devolver la multiplicaci�n 
	 * entre esos dos n�meros.  Los n�meros para probar este m�todo deben ser ingresados en el main
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
