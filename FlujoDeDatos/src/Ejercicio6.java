import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final double IVA = 0.21;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EJERCICIO 6 - CALCULAR PRECIO CON IVA");
		System.out.println("Introduce el precio del producto: ");
		double precioInicial = sc.nextDouble();
		sc.close();
		double precioFinal = precioInicial + (precioInicial * IVA);
		
		System.out.println("El precio final del producto es de: "+precioFinal);
		

	}

}
