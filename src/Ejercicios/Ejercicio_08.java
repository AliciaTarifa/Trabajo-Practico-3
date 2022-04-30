/**
 * 
 */
package Ejercicios;

import java.util.List;
import java.util.Scanner;

/**
 * @author alicia
 *
 */
public class Ejercicio_08 {

	/**
	 * @param args
	 * Ingrese 10 nombres de personas en un vector, luego ingrese un nombre cualquiera y 
	 * búsquelo en el vector, si el nombre aparece en el vector mostrar "Nombre encontrado" 
	 * en caso contrario "Nombre no encontrado".
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    List<String> nombres = List.of("Alicia", "Luis", "Tiziano", "Felipe", "Josefina", "Sofía", "Cristóbal", "Manuel", "Isabel", "Delfina");
	    System.out.print("Ingrese un nombre: ");

	    String nombreABuscar = scanner.nextLine();

	    boolean nombreEncontrado = false;
	    
	    for(String nombre : nombres){
	      if(nombre.equals(nombreABuscar)){
	        nombreEncontrado = true;
	      }
	    }

	    if(nombreEncontrado){
	      System.out.println("Nombre encontrado");
	    }else{
	      System.out.println("Nombre no encontrado.");
	    }

	}

}
