import java.util.Scanner;

public class Ej2
{
	public static void main(String [] args)
	{
		//Creacion de variables
		int [] numeros = new int [10];
		int i;
		Scanner sc = new Scanner(System.in);
		
		for(i = 0;i<numeros.length; i++)
		{
			System.out.print("\nIntroduce el numero para la posicion "+i+":");
			numeros[i] = sc.nextInt();
		}	
		//salida del programa
		for(i=(numeros.length-1);i>-1;i--)
		{
			System.out.print("\nEn la posición "+i+": "+numeros [i]);
		}
		System.out.print("\n");
	}
}
		