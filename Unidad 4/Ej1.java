import java.util.regex.*;
import java.util.Scanner;

//En este ejercicio vamos a validar un DNI

public class Ej1
{
	public static void main(String [] args)
	{	
		
		//Creaacion de variables
		String dni;
		String patron = "[0-9]{8}[a-zA-Z]";
		Scanner sc = new Scanner(System.in);
		
		//Solución
		System.out.print("\nDime tu dni para ver si es correcto: ");
		dni = sc.nextLine();
		
		Pattern p = Pattern.compile(patron);
		Matcher m = p.matcher(dni);
		
		if(m.matches())
		{
			System.out.print("\nEl DNI esta bien.");
		}
		else
		{
			System.out.print("\nEl DNI esta mal");
		}
		System.out.print("\n");
	}
}