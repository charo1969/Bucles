import java.util.Scanner;

/**
 * 9. Algoritmo que escriba las tablas de multiplicar usando esquemas for. 
 * @author charo
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {

		System.out.println("Tablas de multiplicar con for");
		
		for(int tabla =1; tabla<=10;tabla++) {//primer bucle
			for(int i=1;i<=10;i++) {//segundo bucle
				System.out.printf("%d x %d = %d\n",tabla,i,tabla*i);
			}
		}

	}

}
