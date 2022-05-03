/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_12 {

	/**
	 * @param args
	 * Crear un método que reciba cuatro notas de un estudiante este método debe devolver 
	 * el promedio de todas esas notas.  Las notas para probar este método deben ser ingresadas en el main.

	 */
	public static void main(String[] args) {
		
		String alumno = "Tiziano Farfán";
		float nota1 = 8.5f;
		float nota2 = 5.4f;
		float nota3 = 3.8f;
		float nota4 = 9.6f;
		
		float result = promedio (nota1,nota2,nota3,nota4);
		System.out.print("El promedio del alumno " + alumno + " es: " + result);

	}
	public static float promedio (float nta1,float nta2, float nta3, float nta4) {
		return (nta1+nta2+nta3+nta4)/4;
	}

}
