import java.util.Scanner;
import java.util.InputMismatchException;

public class NumeroFinal
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		int num,fn,c;
		Scanner sc = new Scanner(System.in);
		
		//Solución
		try
		{
			System.out.print("Dime un número: ");
			num = sc.nextInt();
			fn = num%10;
			fn = Math.abs(fn);
			System.out.print("El último numero es: "+fn);
		}
		
		catch (InputMismatchException e)
		{
			System.out.print("Eso no es un número");
		}
		
		catch (Exception x)
		{
			System.out.print("ERROR: "+x);
		}
	}
}