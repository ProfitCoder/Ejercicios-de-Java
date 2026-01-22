import java.util.Arrays;

public class Ej5
{
	public static void main(String [] args)
	{
		//Creacion de variables y objetos
		int [] numeros = {1,2,3,4,5};
		int variablePerdida;
		//Solucion
		System.out.println("Original: " + Arrays.toString(numeros));
		
		for(int i = 1;i<numeros.length;i++)
		{
			variablePerdida = numeros [0];
			numeros [0] = numeros [5];
			numeros [1] = variablePerdida;
			numeros [i] = numeros [i+1];
		}
		
		System.out.print("Rotado: " + Arrays.toString(numeros));
	}
}