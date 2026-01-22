import java.util.Scanner;

public class CharactersSeparate
{
	public static void main(String [] args)
	{
		
		//Variables
		int i;
		String cadena;
		Scanner sc = new Scanner(System.in);
		
		//Solucion
		System.out.print("Introduce una cadena para separarla y leerla caracter por caracter: ");
		cadena = sc.nextLine();
		
		for(i=0;i<cadena.length();i++)
		{
			System.out.print("\n"+cadena.charAt(i));
		}
		System.out.print("\n");
	}
}