import java.util.Scanner;

/**
 * 4.Algoritmo  que  escriba  los  números  impares  comprendidos  
 * 		entre  dos  enteros introducidos por el usuario. 
 * @author charo
 *
 */
public class Ejercicio4bis2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Algoritmo de Numeros Impares");
		
		System.out.println("introduzca el primer numero: ");
		int num1 = teclado.nextInt();
		
		System.out.println("introduzca el segundo numero: ");
		int num2 = teclado.nextInt();
		
		// creamos dos variables para minimo y maximo:
		int minimo =num1;
		int maximo = num2;
		
		//ordenamos los valores de mayor a menor si no estan en orden.
		if(num1 > num2) {
			minimo = num2;
			maximo = num1;
		}
		if (minimo%2==0) {
			minimo++;
		}
		
		
		// ahora realizamos el bucle para hacer cálculos y mostrar en pantalla
		for(int i = minimo; i<=maximo; i=i+2) {
			
				System.out.println(i);
			
		}
		
		

	}

}
