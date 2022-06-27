import java.util.Scanner;

/**
 * Pedir los numeros que quiera por teclado y hacer la media
 * @author charo
 *
 */
public class EjercicioExtra2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0;
		
		System.out.println("Cuantos numeros quieres?: ");
		int numeros = teclado.nextInt();
		 
		for(int i=1;i<=numeros;i++) {
			System.out.printf("Introduce el número %d: ",i);
			int num = teclado.nextInt();
			
			suma = suma +num;
		}
		float media = (float)suma /numeros;
		System.out.printf("la media es: %.2f",media);
	}

}
