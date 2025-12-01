import java.util.Scanner;

public class RaizesC
{
	public static void main(String [] args)
	{
		
		//Creacion de variables y objetos
		double x;
		Scanner sc = new Scanner(System.in);
		
		//Solucion del problema
		System.out.print("Dime un numero para hacerle su raiz cuadra y su raiz cubica: ");
		x = sc.nextDouble();
		
		System.out.printf("\nSu raiz cuadrada %.2f.",Math.sqrt(x));
		System.out.printf("\nSu raiz cúbica es %.2f.",Math.pow(x,1.00/3.00));
		
	}
}
		
