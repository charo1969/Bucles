import java.util.Scanner;

/**
 * 14. Algoritmo que pida dos numeros naturales e imprimir su cociente entero por el 
		metodo de las restas sucesivas. 
 * @author charo
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cociente entero por rectas sucesivas");
		
		System.out.println("Introduzca dividendo de una division: ");
		
		int num1 = teclado.nextInt();
		
		System.out.println("Introduzca el divisor de una division: ");
		
		int num2 = teclado.nextInt();
		
		int cociente=0;//variable del cociente inicializada a cero.
		int resto=num1;// el resto es divisor.
		
		while(resto>=num2) {
			resto =resto - num2;// vamos restando sucesivamente el resto con el divisor.
			cociente ++;// vamos incrementando el cociente en 1.
		}
		System.out.println("El cociente es "+ cociente);// imprime el cociente del dividendo y el divisor.
		System.out.println("El resto es "+ resto);// imprime el resto de esta división.
		
		

	}

}
