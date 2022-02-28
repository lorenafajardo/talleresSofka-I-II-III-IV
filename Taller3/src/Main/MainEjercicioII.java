package Main;

public class MainEjercicioII {

	public static void main(String[] args) {
		
		int variablei=0;
		
		while (variablei<=10) {
			
			int espacios=0;
			int asteriscos =0;
			
			while (espacios <= 9-variablei){
				System.out.print(" ");
				espacios = espacios+1;
			}
			
			while(asteriscos <= variablei){
				System.out.print("*");
				asteriscos = asteriscos +1;
			}
			System.out.println();
			variablei = variablei +1;
		}
		
	}

}
