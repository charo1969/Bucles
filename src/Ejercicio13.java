import java.util.Scanner;

/**
 * 13.Algoritmo que pida un numero natural y determine si es primo o no.
 * @author charo
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Numeros Primos");
		
		System.out.println("Introduce un numero: ");
		int num = teclado.nextInt();
		
		int primo=0;
		 
		for(int i=1;i<(num+1);i++) {
			if(num %i ==0) {
				primo++;
				
			}
		}
		if(primo!=2) {
			System.out.println("El numero "+num+" No es primo");
			
			
		}else {
			System.out.println("El numero "+num+" es primo");
			
			
		}
		

	}

}
