import java.util.Scanner;

public class IntercambioContent
{
	public static void main(String [] args)
	{
		
		//Creación e inicialización de variables y objetos
		String cad1,cad2,cad3;
		Scanner sc = new Scanner(System.in);
		
		//Resolución de Problema
		System.out.print("Dime una palabra: ");
		cad1 = sc.nextLine();
		
		System.out.print("Dime otra palabra distinta: ");
		cad2 = sc.nextLine();
		
		System.out.printf("\nLa cadena 1 vale %s y la cadena 2 vale %s",cad1,cad2);
		
		cad3 = cad1;
		cad1 = cad2;
		cad2 = cad3;
		
		System.out.printf("\nEl resultado de cadena 1 es %s y de cadena 2 es %s",cad1,cad2);
		System.out.print("\n");
	
	}
}
