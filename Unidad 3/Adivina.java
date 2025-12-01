import java.util.Scanner;

public class Adivina
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		int prueba,x,intentos=0;
		boolean acertado= false;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("\nAdivina el numero que tengo en mente: ");
		System.out.printf("\nTienes 10 intentos");
		x = (int)(Math.random()*(100-1+1)+1);
				
		do 
		{
			System.out.print("\nIntroduce un numero: ");
			prueba = sc.nextInt();
			if (prueba == x)
			{
				System.out.print("\n¡Has adivinado el numero!");
				acertado = true;
			}
			else 
			{
				if (prueba > x)
				{
					System.out.print("\nEl numero es menor.");
				}
				else 
				{
					System.out.print("\nEl numero es mayor.");
				}
			}
			intentos = intentos+1;
		}
		while (intentos<10 && acertado == false);
		if (intentos == 10)
		{
			System.out.print("\nTe has quedado sin intentos");
		}
		else 
		{
			System.out.printf("\nHas acertado en el intento %d",intentos);
		}
		System.out.printf("\nEl numero era %d",x);
	}
}
