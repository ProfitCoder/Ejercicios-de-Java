import java.util.Scanner;

public class Ej13
{
	public static void main(String [] args)
	{
		//Creacion de variables
		String frase,fraseencriptada = "";
		Scanner sc = new Scanner(System.in);
		String abecedario = "abcdefghijklmnopqrstuvwxyzabc";
		char nuevaletra;
		int posicion;
		
		//Pedir la Frase
		System.out.print("\nFrase para encriptar:");
		frase = sc.nextLine().toLowerCase();
		
		//Encriptar
		for (int i = 0;i < frase.length(); i++)
		{
			posicion = 3;
			if (frase.charAt(i) == ' ')
			{
				fraseencriptada += ' ';
			}	
				for (int j = 0; j < 26; j++)
				{
					if (frase.charAt(i) == abecedario.charAt(j))
					{
						nuevaletra = abecedario.charAt(j+posicion);
						fraseencriptada += nuevaletra;
					}
				}
		}
		
		//Mostrarlo por pantalla
		
		System.out.print("\nFrase encriptada:"+fraseencriptada);
		System.out.print("\n");
	}
}