//@ProfitCoder 			9:08		23/02/2026

import java.util.Arrays;

public class ArrayOrdenado{
	public static void main(String [] args){
		//Array de ints
		int [] ArrayAOrdenar = {1,8,6,7,3};
		
		//Mostrar por pantalla
		System.out.println("\nArray sin Ordenar" + Arrays.toString(ArrayAOrdenar));
		
		//Ordenación del array
		Arrays.sort(ArrayAOrdenar);
		
		//Mostramos por pantalla
		System.out.println("Array Ordenado" + Arrays.toString(ArrayAOrdenar));
		
	}
}