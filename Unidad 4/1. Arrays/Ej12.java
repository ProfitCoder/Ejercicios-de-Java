import java.util.Arrays;

public class Ej12
{
	public static void main(String [] args)
	{
		//Variables y objetos
		int [] numeros = {2,5,9,-4,6}; 
		int [] array2 = new int [10];

		//Para rellenar con un mismo caracter solo necesitamos usar este metodo
		Arrays.fill(array2,-1);
		
		System.out.println("array2: " + Arrays.toString(array2));
		
		
		System.out.println("Array numeros: ");
		//Usar el metodo toString de la clase Arrays para mostrar el array
		System.out.println(Arrays.toString(numeros));
		
		//Ordenamos el array y lo mostramos
		Arrays.sort(numeros);
		
		//Lo mostramos ya cambiado
		System.out.println(Arrays.toString(numeros));
		
		//Buscar un elemento en el array numeros (9)
		System.out.println("El 9 esta en la posicion: " + Arrays.binarySearch(numeros,9));
		
		//Si da un valor negativo es que no esta porque devuelve posicion
		System.out.println("El 10 esta en la posición" + Arrays.binarySearch(numeros,10));
		
		//Si quiero comparar os arrays
		if(Arrays.equals(array2,numeros))
			System.out.println("Iguales");
		else{
			System.out.print("No son iguales");
		}
		System.out.print("\n");
	}
}