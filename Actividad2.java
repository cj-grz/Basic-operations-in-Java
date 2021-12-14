package modulo2;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*programa parra decomponer un numero k
		 * en sus digitos ,decenas, centenas, unidades
		 */
		
		
		Scanner k = new Scanner(System.in);
		int residuo;
		
		System.out.println("Ingresa un nuemro a descomponer : ");
		int k1 = k.nextInt();
		
		int j= 0;
		
		while(k1>0) {
			
			//Calculamos el residuo 
			
			residuo=k1%10;
			
			System.out.println(residuo+ "*10^"+j);
			
			k1 = k1/10;
			j=j+1; 
			 
		}
		
	}

}
