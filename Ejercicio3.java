/*
 * Nombre:Julio
 * Fecha:11/11/2025
 * Descripcion:Un array de tamaño M Y N,son introducidos por el usuario,hay que mostrar al final  cuantos valores son mayores que 0 , cauntos menores que 0 e iguales 
 */
package MárquezOrtegaJulio3_11;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		int N;
		int M;
		int igual = 0;
		int menor = 0;
		int mayor = 0;
		int [] [] solucion;
		
		
		
		System.out.println("Dime el valor N");	
		N = num.nextInt();
		System.out.println("Dime el valor M");
		M = num.nextInt();
		solucion = new int[N][M];
		
		for(int i = 0;i<N;i++) {
			for(int a = 0;a<M;a++) { //Metemos los valores en este apartado
				System.out.print("Pon los valores para que esten dentro del array");
				solucion[i][a] = num.nextInt();
				
				
				
			}
			
		}
		for (int i = 0;i<N;i++) {
			for (int a = 0;a<M;a++) {
				System.out.print(solucion[i][a] + "  "); //Muestra 
			}
			System.out.println();
		}
		for (int i = 0;i<N;i++) {
			for (int a = 0;a<M;a++) {
				if(solucion[i][a] < 0) {
					menor = menor +1;
				}else {
					if (solucion[i][a] == 0) {
						igual = igual + 1;
					}else {
						if (solucion[i][a] > 0) {
							mayor = mayor+1;
						}
					}
				}
			}
		}
		System.out.println("De los numeros introducidos que son iguales que 0 hay" + " "+igual);
		System.out.println("De los numeros introducidos que son mayores que 0 hay" + " " +mayor);
		System.out.println("De los numeros introducidos que son menores que 0 hay" + " " + menor);
	}
}
