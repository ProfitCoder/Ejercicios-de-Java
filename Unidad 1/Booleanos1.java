import java.util.Scanner;

public class Iniciales
{
	public static void main(String [] args)
	{
		
		//Creacion de variables y objetos
		string nom,ap1,ap2,I1,I2,I3;
		Scanner sc = new Scanner(System.in);
		
		//Solucion del problema
		System.out.printf("¿Como te llamas? ")
		nom = sc.nextLine();
		I1 = nom.charArt(0);
		
		System.out.printf("\n¿Cual es tu primer apellido? ");
		ap1 = sc.nextLine();
		I2 = ap1.charArt(0);
		
		System.out.printf("\n¿Cual es tu segundo apellido? ");
		ap2 = sc.nextLine();
		I3 = ap2.charArt(0);
		
		
		System.out.printf("\nTus iniciales son: "+I1+I2+I3);
		
	}
}