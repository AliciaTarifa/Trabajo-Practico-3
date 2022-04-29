/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_06 {

	/**
	 * @param args
	 * Escriba un programa que determine si una palabra es palíndromo. Palíndromo: palabra o expresión que 
	 * es igual si se lee de izquierda a derecha que de derecha a izquierda, por ejemplo, **arenera**.
	 */
	public static void main(String[] args) {
		String palPalíndromo = "anana";

	    String palabraOpuesta = "";
	    for(int posicionLetra = (palPalíndromo.length() - 1); posicionLetra >= 0 ; posicionLetra-- ){
	      palabraOpuesta += palPalíndromo.charAt(posicionLetra);
	    }

	    if(palPalíndromo.equals(palabraOpuesta)){
	      System.out.println(palPalíndromo + " es palabra palíndromo");
	    }else{
	      System.out.println(palPalíndromo + " no es palabra palíndromo");
	    }

	}

}
