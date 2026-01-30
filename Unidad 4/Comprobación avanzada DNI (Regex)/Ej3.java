import java.util.Scanner;
import java.util.regex.*;

public class Ej3
{
	public static void main(String [] args)
	{
		//Creacion de variables
		String dni;
		String patron = "[0-9]{8}[A-Z]";
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra;
		int numero,posicion;
		Scanner sc = new Scanner(System.in);
		
		//Solucion
		System.out.print("\nDime un DNI:");
		dni = sc.nextLine();
		
		Pattern p = Pattern.compile(patron);
		Matcher m = p.matcher(dni);
		
		if(m.matches())
		{
			System.out.print("\nDNI valido.");
			numero = Integer.parseInt(dni.substring(0,8));
			letra = letras.charAt(8);
			System.out.print("\n"+numero);
			System.out.print(letra);
			
			posicion = (numero%23);
			
			if(letra == letras.charAt(posicion))
			{
				System.out.print("\nLa letra coincide");
			}
			else
			{
				System.out.print("\nLa letra no coincide");
			}
		}
		else
		{
			System.out.print("\nDNI invalido.");
		}
	}
}
	
