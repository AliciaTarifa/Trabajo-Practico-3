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
	 * Crear un método que permita ingresar usuario y contraseña. Para que el usuario y contraseña sean válidos 
	 * el usuario tiene que ser igual a cris1234 y la contraseña igual a xf3C#, si el logueo es exitoso devolver 
	 * true sino false. El usuario y contraseña son ingresados en el main, si es exitoso mostrar “logueo exitoso”, 
	 * sino “error logueo”.

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
