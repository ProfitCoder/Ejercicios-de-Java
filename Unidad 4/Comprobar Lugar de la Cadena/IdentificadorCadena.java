import java.util.Scanner;

public class IdentificadorCadena
{
	public static void main(String [] args)
	{
		
		//Variables
		String cadena1,cadena2;
		boolean x = true;
		Scanner sc = new Scanner(System.in);
		
		//Solucion
		try
		{
			System.out.print("\nDime una frase y te dire si esta o no la palabra que escribas abajo: ");
			cadena1 = sc.nextLine();
			System.out.print("Dime la palabra que puede o no estar dentro: ");
			cadena2 = sc.nextLine();
			System.out.print("\nEsta contenida. "+cadena1.contains(cadena2));
			System.out.print("\n");
		}
		catch (Exception e)
		{
			System.out.print("ERROR: "+e);
		}
	}
}
