import java.util.Scanner;

public class CharV
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		char res,a='a',e='e',i='i',o='o',u='u',otras,fin=' ';
		Scanner sc = new Scanner(System.in);
		
		//Solución del problema

		do
		{
			System.out.print("\nDame un caracter:");
			res = sc.nextLine().toLowerCase().charAt(0);
			System.out.print("\n");
			
			if (res == a)
			{
				System.out.print("\nEs una Vocal.");
			}
			else if (res == e)
			{
				System.out.print("\nEs una Vocal.");
			}
			else if (res == i)
			{
				System.out.print("\nEs una Vocal.");
			}
			else if (res == o)
			{
				System.out.print("\nEs una Vocal.");
			}
			else if (res == u)
			{
				System.out.print("\nEs una Vocal.");
			}
			else 
			{
				System.out.print("\nNo es una Vocal.");
			}
		}
		while (res != fin);
		System.out.print("\n");
		System.out.print("\nEl programa ha terminado.");
		System.out.print("\n");
	}
}
