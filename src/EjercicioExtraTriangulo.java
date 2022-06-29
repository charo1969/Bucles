

/*
 * ingresa una cantidad de líneas para el triangulo.
 */
import java.util.Scanner;
public class EjercicioExtraTriangulo {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce las filas para un triangulo: ");
		int fila=teclado.nextInt();
				
		for(int i=1;i<=fila;i++) { 
			for(int j=1;j<=i;j++) {
				System.out.printf(" * ");
			}
			System.out.println();
		}
		
		

	}

}
