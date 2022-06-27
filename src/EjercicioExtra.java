import java.util.Scanner;

/**
 * Pedir 10 numeros pedidos por teclado y hacer la media
 * @author charo
 *
 */
public class EjercicioExtra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0;
		 
		for(int i=1;i<=10;i++) {
			System.out.printf("Introduce el número %d: ",i);
			int num = teclado.nextInt();
			
			suma = suma +num;
		}
		float media = suma /10.0f;
		System.out.printf("la media es: %2f",media);
	}

}
