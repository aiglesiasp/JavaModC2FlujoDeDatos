import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EJERCICIO 10 - NUMERO VENTAS");
		System.out.println("Introduce el numero de ventas: ");
		int numVentas = sc.nextInt();
		double valorTotal = 0.0;
		
		for(int i=1; i<=numVentas; i++) {
			System.out.println("Introduce el valor de la venta numero "+i+" : ");
			double valorVenta = sc.nextDouble();
			valorTotal = valorTotal + valorVenta;
		}
		
		System.out.println("El valor total de las ventas es de: " +valorTotal);

	}

}
