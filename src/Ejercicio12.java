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
		
		int suma = 0;
		
		int res=0;
		
		for (int i =2; i<=num; i++) {
			suma = i/2;
			
			for(int j =1;j<=suma;j++) {
				res =i % j;
				
				if(res == 0) {
					num=num+j;
				}
				if(num == i) {
					System.out.println("El número "+i +" es perfecto");
				}
			}
				
			}
				
			}
		
	}


