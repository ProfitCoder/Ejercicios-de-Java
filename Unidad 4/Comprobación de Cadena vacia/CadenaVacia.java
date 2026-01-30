import java.util.Scanner;

public class CadenaVacia
{
	public static void main(String [] args)
	{
		//Variables
		String cadena;
		Scanner sc = new Scanner(System.in);
		
		//Solución
		System.out.print("Escribe algo o no y te dire lo que has hecho: ");
		cadena = sc.nextLine();
		
		if(cadena == "")
		{
			System.out.print("\nNo has escrito nada.\n");
		}
		else
		{
			System.out.print("\nHas escrito: "+cadena+"\n");
		}
	}
}
