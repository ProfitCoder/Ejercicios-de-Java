import java.util.Scanner;

public class Ej4
{
	public static void main(String [] args)
	{
		//Creacion de variables
		int [] numeros = new int [10];
		Scanner sc = new Scanner(System.ins);
		
		//Solucion
		for(int i = 0;i<numeros.length;i++)
		{
			System.out.print("\nDime un numero para la posición "+i+": ");
			numeros [i] = sc.nextInt();
		}
		
		
		
		
		
		
	}
}