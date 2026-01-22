import java.util.Scanner;

public class NumeroLetras
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		int i,vocal=0,cons=0,alfanum=0;
		String cadena,vocales="aeiou",consonantes="bcdfghjklmnñpqrstvwxyz";
		char carac;
		Scanner sc = new Scanner(System.in);
		
		//solución
		
		try
		{
			System.out.print("Dime una cadena y te dire el número de vocales,consonantes y caracteres: ");
			cadena = sc.nextLine().trim().toLowerCase();
			
			for(i=0;i<cadena.length();i++)
			{
				carac= cadena.charAt(i);
				if (vocales.indexOf(carac) >= 0)
				{
					vocal+=1;
				}
				else if (consonantes.indexOf(carac) >= 0)
				{
					cons+=1;
				}
				else 
				{
					alfanum+=1;
				}
			}
			System.out.printf("\nEn esa cadena hay un total de %d vocales, %d consonantes y %d caracteres alfanumericos.",vocal,cons,alfanum);
		}
		catch (Exception e)
		{
			System.out.print("ERROR: "+e);
		}
	}
}