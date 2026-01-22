import java.util.Arrays;
import java.util.Scanner;

public class Ej9
{
	public static void main(String [] args)
	{
		//Creacion de variables
		String frase;
		Scanner sc = new Scanner(System.in);
		String abecedario = "abcdefghijklmnopqrstuvwxyz";
		char [] letras = abecedario.toCharArray();
		int [] contador = new int [26]; // Se guarda el nº de veces que aparece una letra
		int i,posicion;
		
		
		//Pedir la frase
		System.out.print("Frase: ");
		frase = sc.nextLine().toLowerCase();
		
		//Recorred la frase y cotar el numero de ocurrencias de cada letra
		for (i = 0;i < frase.length();i++)
		{
			posicion = 0;
			for (char letra : letras)
			{
				if(frase.charAt(i) == letra)
				{
					contador[posicion]++;
				}
				posicion++;
			}
		}
		
		//Mostramos por pantalla
		posicion = 0;
		for (char letra : letras)
		{
			System.out.printf("\n%c -> %d veces",letra,contador[posicion]);
			posicion++;
		}					
	}
}