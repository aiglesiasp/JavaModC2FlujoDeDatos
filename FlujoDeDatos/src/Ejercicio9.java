/**
 * 
 */

/**
 * @author aitor
 *
 */
public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("EJERCICIO 9 - PRIMEROS 100 numeros DIVISIBLES POR 2 y 3");
		int num = 1;
		while(num<=100) {
			if(num%2 == 0 && num%3==0) {
				System.out.println(num);
				
			}
				num++;
		}

	}

}
