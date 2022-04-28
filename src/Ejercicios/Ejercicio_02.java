/**
 * 
 */
package Ejercicios;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author alicia
 *
 */
public class Ejercicio_02 {

	/**
	 * @param args
	 * Crear un vector de 20 números reales correspondientes a los pesos de 20 personas. Obtener el peso mayor, 
	 * el menor, el peso medio y visualizar un mensaje si hay alguna persona con un peso mayor de 100 kg.
	 */
	public static void main(String[] args) {
		
		Random rdm = new Random ();
		List<Float> listaPesos = rdm.doubles(40,120).limit(20).boxed().map(Double::floatValue).collect(Collectors.toList());
		
		float mayorPeso = 0;
		float menorPeso = listaPesos.get(0);
		
		for(int indice = 0; indice < listaPesos.size(); indice++){
		      if(listaPesos.get(indice) > mayorPeso){
		        mayorPeso = listaPesos.get(indice);
		      }
		      
		      if(listaPesos.get(indice) < menorPeso){
		          menorPeso = listaPesos.get(indice);
		        }
		}
		System.out.println("Lista de pesos: " + listaPesos);

	    System.out.println("El mayor peso es: " + mayorPeso + " kg");
	    System.out.println("El menor peso es: " + menorPeso + " kg");

	    if(mayorPeso > 100 ){
	      System.out.println("Hay alguien pesa más de 100 kg");
	    }else
	      System.out.println("Nadie pesa más de 100");

		
		

	}

}
