import java.util.Scanner;

/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EJERCICIO 11 - DIAS DE LA SEMANA");
		System.out.println("Introduce un dia de la semana: ");
		String dia = sc.nextLine();
		sc.close();
		
		switch(dia) {
			case "Lunes":
				System.out.println("Es un dia LABORABLE");
				break;
			case "Martes":
				System.out.println("Es un dia LABORABLE");
				break;
			case "Miercoles":
				System.out.println("Es un dia LABORABLE");
				break;
			case "Jueves":
				System.out.println("Es un dia LABORABLE");
				break;
			case "Viernes":
				System.out.println("Es un dia LABORABLE");
				break;
			case "Sabado":
				System.out.println("ES FESTIVO!!!");
				break;
			case "Domingo":
				System.out.println("ES FESTIVO!!!");
				break;
		
		}


	}

}
