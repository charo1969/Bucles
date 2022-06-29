import java.util.Scanner;

/**
 * 6.Algoritmo que calcule el factorial de un número entero introducido por el usuario. 
 * 
 * El factorial de un número es n! = n*(n-1).ejemplo 5!=5x4x3x2x1
 * 
 * 
 * @author charo
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Factorial de un numero");
		
		System.out.println("introduzca un numero: ");
		int num1 = teclado.nextInt();
		
		long factorial = 1;
		
		for(int i = num1; i>1; i--) {
			factorial = factorial * i;
			
		/*for(int i = 1; i<=num1; i++) {
			factorial = factorial * i;
		 
		 */
		}
		//System.out.println("El factorial de "+ num1 +" es "+ factorial);
		System.out.printf("el factorial de %d es %f\n",num1,factorial);

	}

}
