import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EJERCICIO 12 - CALCULADORA INVERSA");
		System.out.print("Introduce el primer numero: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Introduce el segundo numero: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce el operador: ");
		String operador = sc.nextLine();
		sc.close();
		double resultado = 0;
		
		String valor = operador;
		switch(valor) {
			case "+":
				resultado = num1 + num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			case "*":
				resultado = num1 * num2;
				break;
			case "/":
				resultado = num1 / num2;
				break;
			case "^":
				resultado = Math.pow(num1, num2);
				break;
			case "%":
				resultado = num1 % num2;
				break;
			default: 
				System.out.println("Operacion incorrecta");
					
		}
		
		System.out.println("El resultado es: " +resultado);
		
		

	}

}
