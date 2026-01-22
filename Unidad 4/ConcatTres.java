import java.util.Scanner;

public class ConcatTres
{
	public static void main(String [] args)
	{
		//Variables
		try
		{
			String cadena1 = "Hola ",cadena2 = "que tal",cadena3;
			Scanner sc = new Scanner(System.in);
			
			//Solucion
			System.out.print("Dime tu nombre para saludarte: ");
			cadena3 = sc.nextLine();
			cadena1 = cadena1.concat(cadena2);
			cadena1 = cadena1.concat(cadena3);
			System.out.print("\n"+cadena1+"\n");
		}
		catch (Exception e)
		{
			System.out.print("ERROR: "+e);
		}
	}
}