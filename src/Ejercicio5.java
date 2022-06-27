import java.util.Scanner;

/**
 * 5.Algoritmo  que  sume  los n primeros  números  enteros,  siendo  n  un  número introducido por el usuario
 * ejemplo: si queremos el 5 es 1+2+3+4+5 son acumuladores tiene que ser neutro y luegos hacemos un bucle de suma=suma+i
 * @author charo
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Algoritmo de Suma");
		
		System.out.println("introduzca un numero: ");
		int num = teclado.nextInt();
		
		int suma = 0; // un acumulador
		
		for(int i = 1; i<=num; i++) {
			suma = suma + i;
		}
		
		System.out.println("La suma de los n primeros es "+ suma);
		
		

	}

}
