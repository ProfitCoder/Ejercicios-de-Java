import java.util.Scanner;

public class Division
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		double a,b,sol;
		Scanner sc = new Scanner(System.in);
		
		//Resolución de problema
		System.out.print("Dame un numero: ");
		a = sc.nextDouble();
		System.out.print("Dame otro numero: ");
		b = sc.nextDouble();
		
		if (b == 0)
		{
			System.out.print("ERROR, NO PUEDE SER 0");
		}
			else
			{
				sol = (a/b);
				System.out.printf("La solucion de hacer %.2f/%.2f, es = %.2f.",a,b,sol);
			}
	}
}
