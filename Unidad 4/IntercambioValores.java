import java.util.Scanner;

public class IntercambioValores
{
	public static void main(String [] args)
	{
		
		//Variables
		String cadena1,cadena2,cadena3;
		Scanner sc = new Scanner(System.in);
		
		//Solucion
		try
		{
			System.out.print("Di algo: ");
			cadena1 = sc.nextLine();
			System.out.print("Di otra cosa: ");
			cadena2 = sc.nextLine();
			
			System.out.print("\nPrimera cadena: "+cadena1);
			System.out.print("\nSegunda cadena: "+cadena2);
			
			cadena3 = cadena1;
			cadena1 = cadena2;
			cadena2 = cadena3;
			
			System.out.print("\n");
			System.out.print("\nDespues del calculo: ");
			System.out.print("\n");
			System.out.print("\nPrimera cadena: "+cadena1);
			System.out.print("\nSegunda cadena: "+cadena2);
			System.out.print("\n");
		}
		catch (Exception e)
		{
			System.out.print("ERROR: "+e);
		}
	}
}