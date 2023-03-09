import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EJERCICIO 2 - CONCATENAR STRING");
		System.out.println("Introduce tu nombre: ");
		String name = sc.nextLine();
		sc.close();
		System.out.println("Bienvenido " +name);

	}

}
