import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final double PI = 3.141592653;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EJERCICIO 4 - CALCULAR AREA CIRCULO");
		System.out.println("Introduce el radio del circulo: ");
		String radio = sc.nextLine();
		double r = Double.parseDouble(radio);
		double resultado = PI*(Math.pow(r, 2));
		
		System.out.println("El area del circulo es: "+resultado);

	}

}
