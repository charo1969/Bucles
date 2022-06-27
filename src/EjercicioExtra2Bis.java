import java.util.Scanner;

/**
 * Pedir numeros  pedidos por teclado y hacer la media con do while los que el usuario pide.
 * @author charo
 *
 */
public class EjercicioExtra2Bis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0;
		int numeros = 0;
		
		int opcion=0;
		 
		do {
			System.out.printf("Introduce el número %d: ",numeros);
			int num = teclado.nextInt();
			
			suma = suma +num;
			numeros ++;
			System.out.println("¿Quieres más numeros (1-Si, 0-NO)?: ");
			opcion = teclado.nextInt();
		}while(opcion == 1);
		
		float media = (float)suma /numeros;
		System.out.printf("la media es: %.2f",media);
	}

}
