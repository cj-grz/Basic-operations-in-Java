package modulo2;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Programa para calcular el valor de la funcion f(x)
		 * para un valor de entrada x , el cual es leido .
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese el valor de x: ");
		int valor = teclado.nextInt();
		int re;
	
		
		if(valor>=0 && valor<=2) {
			
			//System.out.println("Se calculo el valor de F(x) en el intervalo [0,2]");
			
			re = valor*valor;
			System.out.println("El valor de la funcion F(X) es igual a = "+re+" FX");
			
		}
		
		else if (valor > 2 && valor <= 4) {
			
			//System.out.println("Se calculo el valor de F(x) en el intervalo (2,4]");
			
			re= (-valor*valor)+4 ;
			
			System.out.println("El valor de la funcion F(X) es igual a = "+re+" FX");
			
			
		}
		
		else if (valor>4) {
			
			//System.out.println("Se calculo el valor de F(x) en el intervalo (4,+infinito]");
			
			re = (valor+4);
			
			System.out.println("El valor de la funcion F(X) es igual a = "+re+" FX");
			
		}

	}

}
