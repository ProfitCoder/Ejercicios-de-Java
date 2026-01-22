import java.util.Scanner;
import java.util.regex.*;

public class Ej5
{
	public static void main(String [] args)
	{
		//Variables
		String patron = "[0-9]{4}[\sBCDFGHIJKLMNPRSTVWXYZ]{4}";
		String matricula;
		Scanner sc = new Scanner(System.in);
		
		//Solucion
		System.out.println("\nDime una matricula y te dire si esta bien el formato. (Ejemplo: 0000 XXX):");
		matricula = sc.nextLine().toUpperCase();
		
		Pattern p = Pattern.compile(patron);
		Matcher m = p.matcher(matricula);
		
		if (m.matches())
		{
			System.out.print("\nLa matricula esta correcta.");
		}
		else
		{
			System.out.print("\2La matricula no esta correcta.");
		}
	}
}