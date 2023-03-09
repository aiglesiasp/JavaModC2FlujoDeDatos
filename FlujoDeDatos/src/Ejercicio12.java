import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final String password = "qwerty123456";
		int repeticiones = 3;
		
		System.out.println("EJERCICIO 12 - PASSWORD");
		while(repeticiones > 0) {
			System.out.println("Introduce la contraseña, tienes " +repeticiones+  " intentos: ");
			String valor = sc.nextLine();
			repeticiones--;
			if(valor.equals(password)) {
				System.out.println("Enhorabuena");
				break;
			}	
		}
		sc.close();

	}

}
