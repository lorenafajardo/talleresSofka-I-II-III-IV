
// 3. Imprimir los números primos del 1 al 1000, el resultado debe ser buscado de forma matemática.


package Main;

public class MainEjercicioIII {

	public static void main(String[] args) {
		
		System.out.println("    Números primos del 1 al 1000");
		System.out.println();
		for (int i = 1; i <=1000; i++) {
			int contador=0;
			
			for (int j = 1; j <=i; j++) {
				if ((i % j)==0){
					contador = contador+1;
				}
			}
			
			if(contador<=2){
				System.out.print(i + "  ");
			}
			
		}
		
	}

}
