/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author alicia
 *
 */
public class Ejercicio_10 {

	/**
	 * @param args
	 * Crear dos matrices de mxn y sumar sus valores, los resultados se deben almacenar en otra matriz. 
	 * Los valores y la longitud, serán insertados por el usuario. Mostrar las matrices originales y el resultado.
	 */
	public static void main(String[] args) {
		int cantFilas;
		int cantColumnas;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de filas: ");
		cantFilas = scr.nextInt();
		
		System.out.print("Ingrese la cantidad de columnas: ");
		cantColumnas = scr.nextInt();
		
		int[][] matriz1 = new int [cantFilas][cantColumnas];
		int[][] matriz2 = new int [cantFilas][cantColumnas];
		int[][] matrizResultado = new int [cantFilas][cantColumnas];
		
		System.out.println("Ingrese los valores de la matriz 1: ");
		for (int i = 0; i < cantFilas; i++) {
			for (int j = 0; j < cantColumnas; j++) {
				
			System.out.print("Ingrese el valor de la fila [" + i + "] y la columna [" + j + "]:");
			matriz1[i][j]= scr.nextInt();
			}
		}
		System.out.println("Ingrese los valores de la matriz 2: ");
		for (int i = 0; i < cantFilas; i++) {
			for (int j = 0; j < cantColumnas; j++) {
				
			System.out.print("Ingrese el valor de la fila [" + i + "] y la columna [" + j + "]:");
			matriz2[i][j]= scr.nextInt();
			}
		}
		for(int i=0; i<cantFilas; i++){
		    for(int j=0; j<cantColumnas; j++){
		        matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
		    }
		}
		for(int i=0; i<cantFilas; i++){
		    for(int j=0; j<cantColumnas; j++){
		    	 System.out.print(matrizResultado[i][j] + "\t");
		}
		    System.out.println();
		    }
		

	}
	
	
} 
