import java.util.Scanner;

public class EjemploCasting
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		int a = 12345;
		long b;
		
		//Creacion de Casting automatico
		b = a;
		
		/* Para hacer una conversion explicita de casting
		lo que hacemos si no quiere hacerlo y entra hay que forzar al casting
		y eso se hace poniendo por ejemplo 
		a = (int)b;
		que para que nos funcionara tendria que ser b el numero de a en la definicion
		de variables*/
				
		System.out.printf("valor de a = %d, valor de b = %d\n", a,b);

	}
}