import java.util.regex.*;
import java.util.Scanner;

public class Ej2
{
	public static void main(String [] args)
	{
		//Creacion de variables
		String nie;
		String patron = "[xyzXYZ][0-9]{8}[a-zA-Z]";
		Scanner sc = new Scanner(System.in);
		
		//Solucion
		System.out.print("\nDime cual es tu NIE: ");
		nie = sc.nextLine();
		
		Pattern p = Pattern.compile(patron);
		Matcher m = p.matcher(nie);
		
		if(m.matches())
		{
			System.out.print("\nEl nie esta escrito Correctamente.");
		}
		else 
		{
			System.out.print("\nEl nie esta incorrecto, prueba otra vez.");
		}
		System.out.print("\n");
	}
}
