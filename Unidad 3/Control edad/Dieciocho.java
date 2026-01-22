import java.util.Scanner;

public class Dieciocho
{
	public static void main(String [] args)
	{
		
		//Creación e inicialización de variables
		int nota,edad;
		char sexo;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("Dime tu nota del curso: ");
		nota = sc.nextInt();
		sc.nextLine();
		System.out.print("Dime tu edad: ");
		edad = Integer.parseInt(sc.nextLine());
		System.out.print("Dime tu sexo con F/M: ");
		sexo = sc.nextLine().toUpperCase().charAt(0);
		
		if (nota>=5)
		{
			if (edad>=18)
			{
				if (sexo=='F')
				{
					System.out.print("\nACEPTADA\n");
				}
				else if (sexo=='M')
				{
					System.out.print("\nPOSIBLE\n");
				}
				else
				{
					System.out.print("\nLETRA ERRONEA\n");
				}
			}
			else
			{
				System.out.print("\nNO ACEPTADA\n");
			}
		}
		else 
		{
			System.out.print("\nNO ACEPTADA\n");
		}
		
	}
}
		
