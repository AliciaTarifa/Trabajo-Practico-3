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
public class Ejercicio_16 {

	/**
	 * @param args
	 * Crear un método que reciba una opción si la opción es 1 devolver "inicio" si es 2 "dashboard" 
	 * si es 3 devolver "home" si es 4 devolver "panel", sino es ninguna devolver "error". La opción 
	 * es ingresada en el main.

	 */
	public static void main(String[] args) {
		int opcion;
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Ingrese una opción del 1 al 4: ");
		opcion = scr.nextInt();
		
		String msj = irAOpcion(opcion);
		System.out.println(msj);
		
		scr.close();
	}
	public static String irAOpcion(int opc) {
		String msjARetornar;
		switch (opc) {
	      case 1:
	        msjARetornar = "Estás en el Inicio";
	        break;
	      case 2:
	    	  msjARetornar = "Estás en el Dashboard";
	        break;
	      case 3:
	    	  msjARetornar = "Estás en el Home";
	        break;
	      case 4:
	    	  msjARetornar = "Estás en el panel";
	        break;
	      default:
	    	  msjARetornar = "Error";
	        break;
	    }
	    return msjARetornar;
	}

}
