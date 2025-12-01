import java.util.Scanner;

public class PositivoNegativo
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		int a;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("Dime un numero: ");
		a = sc.nextInt();
		
		if (a<0)
		{
			System.out.print("El numero es negativo");
		}
		else 
		{
			if (a == 0)
			{
				System.out.print("El numero es 0");
			}
			else
			{
				System.out.print("El numero es positivo");
			}
		}		
	}
}