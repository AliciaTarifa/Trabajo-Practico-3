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
	 * Escriba un programa que determine si una palabra es pal�ndromo. Pal�ndromo: palabra o expresi�n que 
	 * es igual si se lee de izquierda a derecha que de derecha a izquierda, por ejemplo, **arenera**.
	 */
	public static void main(String[] args) {
		String palPal�ndromo = "anana";

	    String palabraOpuesta = "";
	    for(int posicionLetra = (palPal�ndromo.length() - 1); posicionLetra >= 0 ; posicionLetra-- ){
	      palabraOpuesta += palPal�ndromo.charAt(posicionLetra);
	    }

	    if(palPal�ndromo.equals(palabraOpuesta)){
	      System.out.println(palPal�ndromo + " es palabra pal�ndromo");
	    }else{
	      System.out.println(palPal�ndromo + " no es palabra pal�ndromo");
	    }

	}

}
