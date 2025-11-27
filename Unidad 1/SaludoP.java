import java.util.Scanner;

public class SaludoP
{
	public static void main(String [] args)
	{
		
		//Variables y objetos
		Scanner sc = new Scanner (System.in);
		
		String Nombre;
		
		//Resolución del problema
		
	System.out.println("\n Como te llamas?");
	
	Nombre = sc.nextLine();
	System.out.printf("\n Hola " + Nombre);
	System.out.println("\n");
	}
}