import java.util.Scanner;

/**
 * 7.Algoritmo  que  cuente  cuántos  múltiplos  de  7  hay  entre  dos  enteros  dados  por  el usuario.
 * @author charo
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Números Multiplos de 7");
		
		System.out.println("introduzca el primer número: ");
		int num1 = teclado.nextInt();
		
		System.out.println("introduzca el segundo número: ");
		int num2 = teclado.nextInt();
		
		int multiplo7;
	
		
		for (int i = num1; i<=num2; i++) {
			
			System.out.println(i);
			multiplo7=i*7;
			System.out.println("Los multiplos de 7 comprendidos entre "+num1+" y "+num2+" son "+multiplo7 );
			
			
		}
		

	}

}
