import java.util.Arrays;

public class Ej8
{
	public static void main(String [] args)
	{
		//Creacion de Variables
		int [] numeros = new int [20];
		int [] numord = new int [20];
		int num = 0;
		
		
		//Solucion del problema
		for (int i = 0;i < numeros.length;i++)
		{
			numeros[i] = (int)(Math.random() * 20);

			if (numeros [i] % 2 == 0)
			{
				numord[num] = numeros [i];
				num++;
			}
		}
		
		System.out.print("Numeros desordenados: ");
		System.out.print(Arrays.toString(numeros));
		
		System.out.print("\n");
		
		for (int x = 0;x < numord.length;x++)
		{
			if (numeros [x]%2 != 0)
			{
				numord [num] = numeros [x];
				num++;
			}
		}
		
		System.out.print("Numeros ordenados: ");
		System.out.print(Arrays.toString(numord));
	}
}