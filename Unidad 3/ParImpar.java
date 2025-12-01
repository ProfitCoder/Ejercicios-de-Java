import java.util.Scanner;

public class ParImpar
{
	public static void main(String [] args)
	{
		
		//Creación de Variables
		int a,sol;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		
		System.out.print("\nDime un número y te dire si es par o impar: ");
		a = sc.nextInt();
		sol = (a%2);
		
		if (sol == 0)
		{
			System.out.print("\nEl numero es par\n");
		}
			else 
			{
				System.out.print("\nEl numero es impar\n");
			}
	}
}