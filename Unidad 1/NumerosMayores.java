import java.util.Scanner;

public class NumerosMayores
{
	public static void main(String [] args)
	{
		
		//Creación de Variables y objetos
		double a,b;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("Dime un numero: ");
		a = sc.nextDouble();
		System.out.print("Dime otro numero: ");
		b = sc.nextDouble();
		
		if (a>b)
		
			System.out.printf("\n%.2f es mayor que %.2f",a,b);
		else
			System.out.printf("\n%.2f es menor que %.2f",a,b);
			
	}
}