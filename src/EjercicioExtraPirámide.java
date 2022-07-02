import java.util.Scanner;

/**
 * Como crear una piramide dado un número de filas.
 * @author charo
 *
 */

public class EjercicioExtraPirámide {

	public static void main(String[] args) {
		
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("¿De cuantas filas quieres la pirámide?: ");
			int fila = teclado.nextInt();
			
			for (int i=1;i<=fila;i++) {
				for (int j=1;j<=fila-i;j++) {
					System.out.print(" ");
				}
				
				for (int j=1; j<=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}

		}

	}


