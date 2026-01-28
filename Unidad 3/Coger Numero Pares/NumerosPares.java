import java.util.Scanner;

public class NumerosPares
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		int x,y,rest,num,v,b;
		Scanner sc = new Scanner(System.in);
		
		//Solución del problema
		System.out.print("\nDime dos numeros, y te mostrare los numeros pares que hay entre estos dos numeros.");
		System.out.print("\nDime el numero menor:");
		x = sc.nextInt();
		System.out.print("\nAhora dime el mayor:");
		y = sc.nextInt();
		System.out.print("\nLos numeros pares son:");
		
		for (;x<=y;x++)
			if (x % 2 == 0)
			{
				System.out.print("\nEl número " + x);
			}		
		System.out.print("\nFin.");
	}
}
		
			
