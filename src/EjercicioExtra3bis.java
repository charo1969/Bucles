import java.util.Random;
import java.util.Scanner;

/**
 * Pedir un número del 1 al 10 hasta que el usuario acierte.
 * @author charo
 *
 */
public class EjercicioExtra3bis {
	

	public static void main(String[] args) {
		Random aleatorio = new Random();
		final int acierto =aleatorio.nextInt(10)+1;
		int oportunidades =3;
		
		
		Scanner teclado = new Scanner(System.in);
		int num;

		do {
			System.out.println("Te quedan "+oportunidades+" intentos.");
			System.out.println("Acierta el número (del 1 al 10: ");
			num = teclado.nextInt();
			
			if(num==acierto) {
				System.out.println("Enhorabuena!!!, Has acertado");
			}else {
				System.out.println("Has fallado. Vuelve a intentarlo");
				oportunidades--;
				
				if (oportunidades == 0) {
					System.out.println("Te has quedado sin intentos. El número era "+acierto);
				}
			}
		}while((num!=acierto) && (oportunidades>0));

	}

}
