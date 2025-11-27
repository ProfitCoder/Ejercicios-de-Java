import java.util.Scanner;

public class DatosPersona
{
	public static void main(String [] args)
	{
		
		//Creación de variables y objetos
		String nom;
		int tef;
		double alt;
		char gen;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("Cual es tu nombre ");
		nom = sc.nextLine();
		
		System.out.print("Cual es tu telefono: ");
		tef = sc.nextInt();
		
		System.out.print("Cual es tu altura:");
		alt = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Y tu genero es H/M :");
		gen = sc.nextLine().charAt(0);
		
		System.out.print("\n");
		
		System.out.printf("\nNombre: %s\nTelefono: %d\nAltura: %.2f\nGenero: %c",nom,tef,alt,gen);
		
	}
}