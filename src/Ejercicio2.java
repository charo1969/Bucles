
	/**
	 * 2. álgoritmo que imprima la tabla de multiplicar correspondiente a un número comprendido
	 * 		entre uno y diez, introducido por el usuario, usando un esquema  while.
	 */
		import java.util.Scanner;

		public class Ejercicio2 {

			public static void main(String[] args) {
				Scanner teclado = new Scanner(System.in);

				System.out.println("tablas de multiplicar");
				
				int num=0;
				while(num<1 || num>10) {
					System.out.println("Introduce un numero del 1 al 10");
					 num = teclado.nextInt();
					
				}
				
				int i = 1;
				
				while (  i <= 10) {
					System.out.printf("%d x %d = %d\n", num, i, num * i);
					i++;
				}

	}

}
