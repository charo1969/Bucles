import java.util.Scanner;

/**
 * 15. Implementar el ejercicio 7 de la práctica 2, introduciendo un esquema do-while, de 
		forma que el usuario decida cuando quiere salir del programa.
 * @author charo
 *
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		
		do { // queremos repetir la opciones que el usuario quiera a traves de un bucle do while
			
			System.out.println("Introduce el salario: ");
			float salario = teclado.nextFloat();
			System.out.println("Introduce el número de hijos: ");
			int nHijos = teclado.nextInt();
			
			float impuesto = 0, descuento =0;
			
			if(salario>=1000 && salario<1600) {
				impuesto = 0.05f;
				
				/*
				 * if(nHijos <=10){
				  descuento = 0.01f*nHijos;
				  } else {
				  	descuento=0.1f;
				  	} */
				
				descuento = 0.01f*nHijos;
				if(descuento>0.1f) {
					descuento = 0.1f;
				}
				
			}else if (salario>=1600 && salario<3000) {
				impuesto = 0.1f;
				descuento = Math.min(0.1f, 0.01f*nHijos);
			}else if (salario >=3000 && salario<4600) {
				impuesto = 0.15f;
				descuento = Math.min(0.1f, 0.01f*nHijos);
			}else if (salario >= 4600) {
				impuesto = 0.2f;
				descuento = Math.min(0.15f, 0.015f*nHijos);
			}
			
			float impuestosTotales = salario * impuesto ;
			
			impuestosTotales = impuestosTotales - (impuestosTotales*descuento);
			
			System.out.println("Los impuestos totales son: "+ impuestosTotales);
			
			System.out.println("Quieres introducir mas datos(0 para NO y 1 para si: ");// pedimos la opcion.
			opcion=teclado.nextInt();// se lo pedimos al usuario
		}while(opcion!=0 );//siempre que la opcion sea distinta a 0 repetir el bucle while
	

	}

}
