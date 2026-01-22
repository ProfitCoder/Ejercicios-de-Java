import java.util.Scanner;

public class Ejercicio4C
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		int numIntentos,positivos=0,negativos=0,iguales=0;
		double valor;
		Scanner sc = new Scanner(System.in);
		
		//Solucion del problema
		System.out.print("\n¿Cuantos numeros quieres introducir?");
		numIntentos = sc.nextInt();
		
		while (numIntentos>0)
		{
			numIntentos = numIntentos-1;
			System.out.print("\nIntroduce uno: ");
			valor = sc.nextDouble();
			if (valor > 0)
			{
				positivos = (positivos+1);
			}
			else if (valor == 0)
			{
				iguales = (iguales+1);
			}
			else 
			{
				negativos = (negativos+1);
			}
		}
		System.out.printf("\nEl numero de positivos introducidos han sido %d, iguales a 0 %d y de negativos %d.",positivos,iguales,negativos);
	}
}
