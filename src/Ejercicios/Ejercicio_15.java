/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_15 {

	/**
	 * @param args
	 * Crear un m�todo que permita ingresar usuario y contrase�a. Para que el usuario y contrase�a sean v�lidos 
	 * el usuario tiene que ser igual a cris1234 y la contrase�a igual a xf3C#, si el logueo es exitoso devolver 
	 * true sino false. El usuario y contrase�a son ingresados en el main, si es exitoso mostrar �logueo exitoso�, 
	 * sino �error logueo�.

	 */
	public static void main(String[] args) {
		String usuario = "cris1234";
		String contrasenia = "xf3C#";
		
		if (login(usuario,contrasenia)) {
			System.out.println("Logueo Exitoso");
		} else {
			System.out.println("Error de Logueo");
		}

	}
	public static boolean login(String userName, String password) {
		if (userName.equals("cris1234")) {
			return password.equals("xf3C#");	
			} else {
				return false;
		}
	}
}
