/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_09 {

	/**
	 * @param args
	 * Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la matriz.
	 */
	public static void main(String[] args) {
		int cantFilas, cantColumnas;
		cantFilas = cantColumnas = 3;
		
		int[][] array = new int [cantFilas][cantColumnas];
		
		array[0][0] = 1;
	    array[0][1] = 2;
	    array[0][2] = 3;
	    array[1][0] = 4;
	    array[1][1] = 5;
	    array[1][2] = 6;
	    array[2][0] = 7;
	    array[2][1] = 8;
	    array[2][2] = 9;
	    
	    for (int i = 0; i < cantFilas; i++) {
	    	for (int j = 0; j < cantColumnas; j++) {
	    		 System.out.print(array[i][j] + "\t");
	    	}
	    	System.out.println();
	    }

	}

}
