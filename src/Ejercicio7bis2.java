import java.util.Scanner;

/**
 * 7.Algoritmo  que  cuente  cuAntos  múltiplos  de  7  hay  entre  dos  enteros  dados  por  el usuario.
 * @author charo
 *
 */
public class Ejercicio7bis2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Numeros Multiplos de 7");
		
		System.out.println("introduzca el primer numero: ");
		int num1 = teclado.nextInt();
		
		System.out.println("introduzca el segundo numero: ");
		int num2 = teclado.nextInt();
		
		
		int contador =0;//contador
	
		
		while(num1%7==0) {
				num1++;
			}
			
			for(int i=num1; i<num2;i=i+7) {
				contador ++;
			}
		
		System.out.println("la suma de los multiplos de 7 son "+contador);
		
		System.out.println("Hay %d divisores de 7 son ",contador,num1,num2);
		
		
	}

}
