import java.util.Scanner;
import javax.swing.JOptionPane;

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
		
		System.out.println("EJERCICIO 13 - CALCULADORA INVERSA");
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
		JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
		

	}

}
