import java.util.Scanner;

/**
 * 11. Algoritmo que escriba la tabla de multiplicar usando esquemas do while.
 * @author charo
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {

		System.out.println("Tablas de multiplicar con while");
		
		
		int num=1;
		int i=1;
		do {
			i=1;
			do{
				System.out.printf("%d x %d = %d\n",num,i,num*i);
				i ++;
				
			}while( i<=10);
			num++;
		}while(num<=10);
			
			 
				
			}
		}

	


