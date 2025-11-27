import java.util.Scanner;

public class Media3
{
	public static void main(String [] args)
	{
		
		//Creacion de variables y operaciones
		double x,y,z;
		Scanner sc = new Scanner(System.in);
		double solucion;
		
		//Solucion del problema
		System.out.print("Dime el primer numero para la media de 3 numeros: ");
		x+ = sc.nextDouble();
		
		System.out.print("\nDime el segundo numero para la media de 3 numeros: ");
		y += sc.nextDouble();
		
		System.out.print("\nDime el tercer numero para la media de 3 numeros: ");
		z += sc.nextDouble();
		
		solucion = ((x+y+z)/3);
		System.out.printf("\nLa media de %.2f, %.2f y %.2f es %.2f ",x,y,z,solucion);
		
	}
}