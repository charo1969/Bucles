
public class Ejercicio12bis {

	public static void main(String[] args) {
		
        System.out.println("Números perfectos entre 1 y 1000: ");
        
        for( int i=1;i <= 1000;i++){      // i es el número que vamos a comprobar
            int suma = 0;
            for(int j = 1;j < i;j++){    // j son los divisores. Se divide desde 1 hasta i-1                          
                 if(i % j==0){
                    suma = suma + j; // si es divisor se suma
                 }
            }
          if(i == suma){             // si el numero es igual a la suma de sus divisores es perfecto              
             System.out.println(i);
          }
        }

	}

}
