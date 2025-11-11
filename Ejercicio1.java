/*
 * Nombre:Julio
 * Descripción:Una matriz de tamaño 5x5 que almacene del 1 hasta el 25 y luego lo muestre por pantalla
 * Fecha:10/!!/2025
 */
package MárquezOrtegaJulio3_11;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int filas = 5;
		final int columnas = 5;
		int num = 0;
		int[][] numeros;
		numeros = new int [filas][columnas];
		int contador = 1;
		for(int i = 0;i<numeros.length;i++) {
			for(int a = 0;a < numeros.length;a++) {
				numeros[i][a] = contador;
				contador++;
			}
		}
		for (int i = 0;i < numeros.length;i++) {
			for (int a = 0;a < numeros.length;a++) {
				System.out.print(numeros[i][a] + " ");
				
			}
			System.out.println();
		}
	
		
		
	}

}
