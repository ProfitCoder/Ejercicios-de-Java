import java.util.Scanner;

public class TablaMult
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		int a,b=-1,res;
		Scanner sc = new Scanner(System.in);
		
		//Solucion del problema
		System.out.print("Dime un numero y haré su tabla de multiplicar");
		a = sc.nextInt();
		System.out.printf("Tabla de Multiplicar del %d.",a);
		
		do 
		{
			b++;
			res = b*a;
			System.out.printf("\n%d x %d = %d",a,b,res);
		}
		while (b<=10);
			System.out.print("\nYa he terminado la tabla.");
	}
}