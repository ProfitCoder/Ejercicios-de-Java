import java.util.Scanner;

public class MayorEdad
{	
	public static void main(String [] args)
	{
		
		//Creación de objetos y variables
		int a;
		String edad;
		Scanner sc = new Scanner(System.in);
		
		//Resolucion del problema
		System.out.print("¿Que edad tienes? ");
		a = sc.nextInt();
		
		
		edad = (a >= 18)?"Mayor":"Menor";
		System.out.printf("Eres "+edad);
	}
}
		
