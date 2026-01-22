import java.util.Scanner;

public class EcuacionGrado2
{
	public static void main (String[] args)
	{
		
		//Declaración de variables
		
		Scanner sc = new Scanner(System.in);
		double solucion1,solucion2,a ,b,c;
		//Resolución del problema
		
		try
		{
				System.out.println("Introduzca el valor de a, en la ecuación de segundo grado: ");
				a = Double.parseDouble(sc.nextLine());
				System.out.println("Introduzca el valor de b, en la ecuación de segundo grado: ");
				b = Double.parseDouble(sc.nextLine());
				System.out.println("Introduzca el valor de c, en la ecuación de segundo grado: ");
				c = Double.parseDouble(sc.nextLine());
			
				if (a != 0)
				{
					solucion1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
					solucion2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
					System.out.println("La solución 1 de la ecuación es:"+ solucion1);
					System.out.println("La solución 2 de la ecuación es:"+ solucion2);
				}
				else
					System.out.printf("\nNo se puede dividir entre 0");
		}
		
		catch (NumberFormatException e)
		{
			System.out.println("El formato del dato introducido no es correcto");
		}
		
		
		catch (Exception e)
		{
			System.out.println("ERROR: "+e);
		}
	}
}
