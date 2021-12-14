package modulo2;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*codigo para verificarr codigos y contarlos 
		 * Hace un ciclo repetitivo que lee,cuenta e imprime los codigos 
		 */
		
		int cont=0;
int cont2=0;
		do {
			Scanner cod= new Scanner(System.in);
			System.out.println("Ingresa un codigo a verificar : "); 
			int codigo = cod.nextInt();
			
			if(codigo >= 10000000 && codigo <= 99999999) {
				
				System.out.println("Codigo Valido");
				cont=cont+1;
				
			}else {
				
				System.out.println("El codigo No es valido ");
				System.out.println("Fin del proceso de verificacion del codigo "+codigo);
				
			}
			cont2 =cont+1;
			
			
		}while (cont2 < 4 || cont2 > 4 ); {
		
			System.out.println("Numero de codigo validos "+cont);
	}
		
}}
