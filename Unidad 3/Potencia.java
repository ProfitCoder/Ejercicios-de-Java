import java.util.Scanner;

public class Potencia
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		int e,b,s1,s2,s3;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("Dime un numero para la base de la operación: ");
		b = sc.nextInt();
		System.out.print("Dime un numero para el exponente: ");
		e = sc.nextInt();
		
		if (e>0)
		{
			s1 = (int)Math.pow(b,e);
			System.out.printf("La solución de %d elevado a %d es %d.",b,e,s1);
		}
		else if(e == 0)
		{
			s2 = 1;
			System.out.printf("La solución de %d elevado a %d es %d.",b,e,s2);
		}
		else
		{
			s3 = 1/(int)Math.pow(b,-e);
			System.out.printf("La solución de %d elevado a %d es %d.",b,e,s3);
		}
	}
}