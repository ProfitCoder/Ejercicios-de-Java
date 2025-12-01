import java.util.Scanner;

public class Factorial
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		int x,factorial;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("Dime un numero para hacer sus factoriales: ");
		x = sc.nextInt();
		System.out.println(x+"!=");
		
		for (factorial=1;x>=2; x--)
		{
			factorial *= x;
			System.out.print(x+"x");
		}
		System.out.println("1="+factorial);
	}
}