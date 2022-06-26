import java.util.Scanner;

/**
 * 7.Algoritmo  que  cuente  cuántos  múltiplos  de  7  hay  entre  dos  enteros  dados  por  el usuario.
 * @author charo
 *
 */
public class Ejercicio7bis {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		System.out.println("Números Multiplos ");
		
		System.out.println("introduzca el primer número: ");
		int num1 = teclado.nextInt();
		
		System.out.println("introduzca el segundo número: ");
		int num2 = teclado.nextInt();
		
		System.out.println("introduzca el número multiplo: ");
		int numx = teclado.nextInt();
	
		
		int multiplo;
	
		
		for (int i = num1; i<=num2; i++) {
			
			System.out.println(i);
			multiplo=i*numx;
			System.out.println("Los multiplos de 7 comprendidos entre "+num1+" y "+num2+" son "+multiplo);
			
			
		}
		

	}

}
