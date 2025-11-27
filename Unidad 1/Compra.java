import java.util.Scanner;

public class Compra
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		final double DESCUENTO=0.15;
		double pvp,pm,preciof;
		Scanner sc = new Scanner(System.in);
		
		//Resolucion del problema
		System.out.print("¿Cuanto es lo que te cuesta el producto? ");
		pvp = sc.nextDouble();
		
		pm = (pvp*DESCUENTO);
		preciof = (pvp-pm);
		System.out.printf("El precio final a pagar es: " + preciof);
		
	}
}