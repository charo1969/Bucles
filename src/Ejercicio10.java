import java.util.Scanner;

/**
 * 10. Algoritmo que escriba la tabla de multiplicar usando esquemas while.
 * @author charo
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		System.out.println("Tablas de multiplicar con while");
		
		
		int num=1;
		int i=1;
		while(num<=10) {
			i=1;
			while( i<=10){
				System.out.printf("%d x %d = %d\n",num,i,num*i);
				i++;
				
			}
			num++;
		}
			
			 
				
	}
	

}

	


