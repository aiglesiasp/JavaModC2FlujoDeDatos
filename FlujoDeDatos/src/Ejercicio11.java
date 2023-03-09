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
		
		switch(dia.toUpperCase()) {
			case "LUNES":
				System.out.println("Es un dia LABORABLE");
				break;
			case "MARTES":
				System.out.println("Es un dia LABORABLE");
				break;
			case "MIERCOLES":
				System.out.println("Es un dia LABORABLE");
				break;
			case "JUEVES":
				System.out.println("Es un dia LABORABLE");
				break;
			case "VIERNES":
				System.out.println("Es un dia LABORABLE");
				break;
			case "SABADO":
				System.out.println("ES FESTIVO!!!");
				break;
			case "DOMINGO":
				System.out.println("ES FESTIVO!!!");
				break;
		
		}


	}

}
