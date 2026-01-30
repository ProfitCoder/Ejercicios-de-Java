import java.util.Scanner;

public class ConvertirMayusMins
{
	public static void main (String [] args)
	{
		
		//Variables
		String cadena,resultado;
		char letra,primera;
		int i;
		Scanner sc = new Scanner(System.in);
		
		//Solucion
		try
		{
			System.out.print("Dime una cadena con mayusculas y minusculas y las pondre correctamente: ");
			cadena = sc.nextLine().toLowerCase().trim();														//Acordarse del trim
			
			primera = cadena.charAt(0);
			primera=Character.toUpperCase(primera);
			System.out.print(primera);
			for (i=1;i<cadena.length();i++)
			{
				letra = cadena.charAt(i);
				if (letra == primera)
				{
					letra = Character.toUpperCase(primera);
					System.out.print(primera);
					
				}
				else
				if (letra == ' ')
				{
					i++;
					letra = Character.toUpperCase(cadena.charAt(i));
					System.out.print(" "+letra);
				}
				else	
				{
					letra = Character.toLowerCase(cadena.charAt(i));
					System.out.print(letra);
				}	
			}
		}
		catch (Exception e)
		{
			System.out.print("ERROR: "+e);
		}	
	}
}
