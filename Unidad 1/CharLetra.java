import java.util.Scanner;

public class CharLetra
{	
	public static void main(String [] args)
	{
		
		//Creación de Variables
		char a;
		String cad;	
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("\nDime una letra: ");
		a = sc.nextLine().charAt(0);
		
		System.out.print("ahora una frase ");
		cad = sc.nextLine();
		
		System.out.println("Los valores que has dado quedan como: "+a+cad);
	}
}