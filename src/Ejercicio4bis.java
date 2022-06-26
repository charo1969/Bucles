import java.util.Scanner;

/**
 * 4.Algoritmo  que  escriba  los  números  pares  comprendidos  
 * 		entre  dos  enteros introducidos por el usuario. 
 * @author charo
 *
 */
public class Ejercicio4bis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Algoritmo de Números pares");
		
		System.out.println("introduzca el primer número: ");
		int num1 = teclado.nextInt();
		
		System.out.println("introduzca el segundo número: ");
		int num2 = teclado.nextInt();
		
		// creamos dos variables para mínimo y maximo:
		int minimo;
		int maximo;
		
		//ordenamos los valores de mayor a menor si no estan en orden.
		if(num1 < num2) {
			minimo = num1;
			maximo = num2;
		}else {
			minimo = num2;
			maximo = num1;
			
		}
		// ahora realizamos el bucle para hacer cálculos y mostrar en pantalla
		for(int i = minimo; i<maximo; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		

	}

}
