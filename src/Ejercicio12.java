import java.util.Scanner;

/**
 * 12.Algoritmo que determine si un número entero dado es perfecto o no. Se dice que un número es perfecto cuando es igual a 
 * la suma de sus divisores, excluido él mismo. Por ejemplo 6 es perfecto, ya que 6 = 1 + 2 + 3. 
 * @author charo
 *
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Números Perfectos");
		
		System.out.println("Introduce un numero: ");
		int num = teclado.nextInt();
		int suma=0;
		
		for (int i =1; i<num; i++) { //i son los divisores.Se divide desde el 1 hasta num-1
			if(num % i ==0) {
				suma = suma +i;
				
			}
				
		}
		if (suma == num) {
			System.out.println("El número  es perfecto");
		}else {
			System.out.println("El número NO es perfecto");
		}
			
		}
			
	}


