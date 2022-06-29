import java.util.Scanner;

/**
 * 8.Algoritmo que escriba todos los divisores de un numero entero introducido
 * por el usuario.
 * 
 * @author charo
 *
 */
public class Ejercicio8bis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Divisores");

		System.out.println("introduzca un número: ");
		int num = teclado.nextInt();

		/*int divisor = 1;

		while (divisor <= num) {

			if (num % divisor == 0) {

				System.out.println(divisor);

			}
			divisor = divisor + 1;
		}
		*/
		for(int i=1;i<=num;i++) {
			if (num % i == 0) {

				System.out.println(i);

			}
		}

	}

}
