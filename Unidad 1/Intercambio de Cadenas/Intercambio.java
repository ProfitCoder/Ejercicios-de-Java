import java.util.Scanner;

public class Intercambio
{
	public static void main(String [] args)
	{
		
		//Creacion de variables y objetos
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		
		//Resolucion del problema
		System.out.print("Dime el valor para una variable A y una B e intercambiaremos el valor de cada una. Primero A: ");
		a = sc.nextDouble();
		
		System.out.print("\nY ahora B: ");
		b = sc.nextDouble();
		
		c = a;
		a = b;
		b = c;
		
		System.out.printf("\nLos valores cambiados serian valor de A = %.2f y el valor de B = %.2f\n",a,b);
		
	}
}
		
		
		
