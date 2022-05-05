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
	 * Crear un m�todo que reciba una opci�n si la opci�n es 1 devolver "inicio" si es 2 "dashboard" 
	 * si es 3 devolver "home" si es 4 devolver "panel", sino es ninguna devolver "error". La opci�n 
	 * es ingresada en el main.

	 */
	public static void main(String[] args) {
		int opcion;
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Ingrese una opci�n del 1 al 4: ");
		opcion = scr.nextInt();
		
		String msj = irAOpcion(opcion);
		System.out.println(msj);
		
		scr.close();
	}
	public static String irAOpcion(int opc) {
		String msjARetornar;
		switch (opc) {
	      case 1:
	        msjARetornar = "Est�s en el Inicio";
	        break;
	      case 2:
	    	  msjARetornar = "Est�s en el Dashboard";
	        break;
	      case 3:
	    	  msjARetornar = "Est�s en el Home";
	        break;
	      case 4:
	    	  msjARetornar = "Est�s en el panel";
	        break;
	      default:
	    	  msjARetornar = "Error";
	        break;
	    }
	    return msjARetornar;
	}

}
