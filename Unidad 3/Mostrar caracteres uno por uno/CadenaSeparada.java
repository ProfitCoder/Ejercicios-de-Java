import java.util.Scanner;

public class CadenaSeparada
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		int posicion;
		String cadena;
		char letra;
		Scanner sc = new Scanner(System.in);
		
		//Soluación
		try
		{
			System.out.print("Dime una linea de texto, para mostrar los caracteres uno por uno: ");
			cadena = sc.nextLine();
			for (posicion=0;cadena.length()>posicion;posicion++)
			{
				System.out.println(cadena.charAt(posicion));
			}
		}
		catch (Exception e)
		{
			System.out.print("ERROR:"+e);	
		}
	}
}
