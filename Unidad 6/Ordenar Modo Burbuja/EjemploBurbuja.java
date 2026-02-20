//Pablo Manuel Fernandez Velazquez  			12:14			20/02/2026

/*Metodo burbuja es aquel que sirve para ordenar
Arrays de la manera que se indique */

import java.util.Scanner;
import java.util.Arrays;

public class EjemploBurbuja{
	//Metodo burbuja
	public static void burbuja(int[] numeros){
		int aux = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Arrays.toString(numeros));
		
		for(int i = 0;i < numeros.length;i++){
			for(int j = 0;j < numeros.length - i -1;j++){
				if(numeros[j] > numeros[j + 1]){
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
					System.out.print(Arrays.toString(numeros));
					sc.nextLine();
				}
			}
		}
		System.out.println("Array Ordenado: ");
		System.out.println(Arrays.toString(numeros));
	}
	
	public static void main(String [] args){
		//Creación de variables
		int[] numeros = {4,7,9,1,-3,6,2};
	
		burbuja(numeros);
	}
}	