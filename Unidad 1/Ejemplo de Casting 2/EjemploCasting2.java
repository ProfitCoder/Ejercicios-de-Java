import java.util.Scanner;

public class EjemploCasting2
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		int a,b;
		double division;
		
		//Resolucion
		a = 10;
		b=3;
		division = (double)a/b;		//Esto convierte si o si a double la a, y si no entrase coge lo que entre
				
		System.out.printf("/n%d/%d=%f\n", a,b,division);

	}
}
