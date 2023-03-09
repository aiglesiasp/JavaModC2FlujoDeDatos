/**

 * 
 */


/**
 * @author aitor
 *
 */

import java.util.Scanner;

public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EJERCICIO 1 - MAYOR, MENOR o IGUAL");
		System.out.println("Introduce el numero A: ");
		int numA = sc.nextInt();
		System.out.println("Introduce el numero B: ");
		int numB = sc.nextInt();
		
		if (numA < numB) {
			System.out.println("El numero A es MENOR que el numero B");
		} else if (numA > numB) {
			System.out.println("El numero A es MAYOR que el numero B");
		} else {
			System.out.println("Los dos numeros son IGUALES");
		}
		

	}

}
