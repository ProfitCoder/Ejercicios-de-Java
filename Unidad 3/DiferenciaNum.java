import java.util.Scanner;

public class DiferenciaNum
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		int x,y,resultado,distancia;
		Scanner sc = new Scanner(System.in);
		
		//Solucion del problema
		System.out.println("Dime un número: ");
		x = sc.nextInt();
		
		System.out.println("Dime otro número: ");
		y = sc.nextInt();
		
		distancia = (x-y);
		
		resultado = (distancia<0)?(distancia*(-1)):(distancia);
		System.out.printf("la distancia entre el número %d y el número %d es %d.",x,y,resultado);
		
	}
}