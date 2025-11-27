import java.util.Scanner;

public class Dinero
{
	public static void main(String [] args)
	{
		
		//Creación de variables y objetos
		int d1,d2;
		double c1,c2,c3,dt;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("\n¿Cuantas monedas de 2 euros tienes? ");
		d2 = sc.nextInt();
		
		System.out.print("\n¿Y de 1 euro? ");
		d1 = sc.nextInt();
		
		System.out.print("\n¿Y de .50 centimos? ");
		c1 = sc.nextInt();
		
		System.out.print("\n¿Y de .20 centimos? ");
		c2 = sc.nextInt();
		
		System.out.print("\n¿Y de .10 centimos? ");
		c3 = sc.nextInt();
		
		d2 = d2*2;
		c1 = 0.50*c1;
		c2 = 0.20*c2;
		c3 = 0.10*c3;
		
		dt = d1+d2+c1+c2+c3;
		System.out.printf("\nTienes un total de %.2f euros. ",dt);
		System.out.print("\n");
		
	}
}
		
		
		
		
		