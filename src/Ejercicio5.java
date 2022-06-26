import java.util.Scanner;

/**
 * 5.Algoritmo  que  sume  los n primeros  números  enteros,  siendo  n  un  número introducido por el usuario
 * @author charo
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Algoritmo de Suma");
		
		System.out.println("introduzca un número: ");
		int num = teclado.nextInt();
		
		int suma = 0;
		
		for(int i = num; i>0;i--) {
			suma = suma + i;
		}
		
		System.out.println("La suma de "+ num +" es "+ suma);
		
		

	}

}
