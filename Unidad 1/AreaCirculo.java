import java.util.Scanner;

public class AreaCirculo
{
	public static void main (String [] args)
	{
		//Declaracion de variables
		double radio,area;
		Scanner sc = new Scanner (System.in);
		
		//Resolucion del problema
		System.out.print("\nintroduce el radio:");
		radio= sc.nextDouble();
		
		area =(Math.PI*(radio*radio));
		System.out.println("\nel area es:" +area);
	}
}