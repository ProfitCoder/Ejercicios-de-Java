import java.util.Scanner;

public class Operaciones
{
	public static void main(String [] args)
	{
		//Vamos a definit variables
		double x,y;
		Scanner sc = new Scanner(System.in);
		double solucion;
		
		//Solucion al problema
		System.out.print("Escribe el primer numero para las operaciones: ");
		x = sc.nextDouble();
		
		System.out.print("\nEscribe el segundo numero para las operaciones: ");
		y = sc.nextDouble();
		
		//Suma
		solucion = (x+y);
		System.out.printf("\nel resultado de la suma de los numeros %.2f y de %.2f es %.2f",x,y,solucion);
		
		//Resta
		solucion = (x-y);
		System.out.printf("\nel resultado de la resta de los numeros %.2f y de %.2f es %.2f",x,y,solucion);
		
		//Division
		solucion = (x/y);
		System.out.printf("\nel resultado de la division de los numeros %.2f y de %.2f es %.2f",x,y,solucion);
		
		//Multiplicacion
		solucion = (x*y);
		System.out.printf("\nel resultado de la multiplicacion de los numeros %.2f y de %.2f es %.2f",x,y,solucion);
		
		
	}
}
