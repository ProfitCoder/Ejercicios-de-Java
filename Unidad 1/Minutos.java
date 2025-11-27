import java.util.Scanner;

public class Minutos
{
	public static void main(String [] args)
	{
		
		//Creacion de variables y objetivos
		
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		
		
		//Solucionador del problema
		System.out.println("Dime un número de minutos para que te de la equivalencia en horas y minutos: ");
		x = sc.nextInt();
		
		y = (x/60);
		z = (x%60);
		System.out.printf("El resultado de minutos de %d  son %d horas y %d minutos. ", x,y,z);
		
	}
}