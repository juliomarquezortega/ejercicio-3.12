/*
 * Nombre:Julio
 * Descripcion:un array que guarde 4 alumnos y 5 asignaturas,se debe mostrar nota mínima,maxima y media
 * Fecha:11/11/2025
 */
package MarquezOrtegaJulio3_12;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		
		final int ALUMNOS = 4;
		final int ASIGNATURAS = 5;
		int [] [] calificaciones;
		calificaciones = new int [ALUMNOS][ASIGNATURAS];
		double media;
		
		
		
		for(int i = 0;i<ALUMNOS;i++) {
			for(int a = 0;a<ASIGNATURAS;a++) { //Metemos los valores en este apartado
				System.out.print("Pon las notas");
				calificaciones[i][a] = num.nextInt();
				
				
				
			}
			
		}
		for (int i = 0;i<ALUMNOS;i++) {
			for (int a = 0;a<ASIGNATURAS;a++) {
				System.out.print(calificaciones[i][a] + "  "); //Muestra 
			}
			System.out.println();
		
	}
		for (int i = 0;i<ALUMNOS;i++) {
			double total = 0;
			int minimo = calificaciones[i][0];
			int maximo = calificaciones [i][0];
			for (int a = 0;a<ASIGNATURAS;a++) {
				
				int nota = calificaciones[i][a];
				 total += nota;
				if (nota < minimo) {
					minimo = nota ;
				}
				if (nota > maximo) {
					maximo = nota;
					
					
				}
				
			}
			media =  total/ASIGNATURAS;
			System.out.println("El alumno " + (i+1) + ":");
			System.out.println("La nota mínima es " + minimo);
			System.out.println("Nota maxima " + maximo);
			System.out.println("Nota media: " + media);
		}
		
	}

}
