import java.util.Scanner;
import java.util.regex.*;

public class Ej4
{
	public static void main(String [] args)
	{
		//Variables
		String patron = "[XYZ][0-9]{7}[A-Z]";
		String nie;
		String letrasPrinc = "XYZ";
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char = letra1,letra2;
		int poscion,numero;
		Scanner sc = new Scanner(System.in);
		
		//Solucion
		System.out.print("\nDime un nie:");
		nie = sc.nextLine().toUpperCase();
		
		Pattern p = Pattern.compile(patron);
		Matcher m = p.matcher(nie);
		
		if (m.matches())
		{
			letra1 = nie.charAt(0);
			letra2 = nie.charAt(8);
			numero = Integer.parseInt(nie.substring(0,8));
			
			if(letra1 == letras);
			{
				
				
				
				
				
				
				
				
				
				
			}
			else
			{
				System.out.print("\nNo esta bien la primera letra.");
			}
		}
		else
		{
			System.out.print("\nError en el Patron.");
		}
	}
}