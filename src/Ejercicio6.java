import java.util.Scanner;

/**
 * 6.Algoritmo que calcule el factorial de un número entero introducido por el usuario. 
 * 
 * El factorial de un número es n! = n*(n-1).
 * 
 * 
 * @author charo
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Factorial de un número");
		
		System.out.println("introduzca un número: ");
		int num1 = teclado.nextInt();
		
		int factorial = 1;
		
		for(int i = num1; i>0; i--) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de "+ num1 +" es "+ factorial);

	}

}
