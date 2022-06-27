import java.util.Scanner;

/**
 * 7.Algoritmo  que  cuente  cuántos  múltiplos  de  7  hay  entre  dos  enteros  dados  por  el usuario.
 * @author charo
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Numeros Multiplos de 7");
		
		System.out.println("introduzca el primer numero: ");
		int num1 = teclado.nextInt();
		
		System.out.println("introduzca el segundo numero: ");
		int num2 = teclado.nextInt();
		
		int suma =0;
		int contador =0;
	
		
		for (int i = num1; i<=num2; i++) {
			
			
			if(i%7==0) {
				suma = suma + 1 ;
				
				}
			
			contador ++;

			}
		
		System.out.println("la suma de los multiplos de 7 son "+suma);
	}

}
