import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EJERCICIO 5 - DIVISIBLE POR 2");
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		sc.close();
		if(num%2 == 0) {
			System.out.println("El numero SI que es divisible por 2");
		} else {
			System.out.println("El numero NO es divisible por 2");
		}

	}

}
