import java.util.Scanner;

public class OrdenarNum
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("\nDime un número: ");
		a = nextInt();
		System.out.print("\nDime otro número: ");
		b = nextInt();
		System.out.print("\nDime otro número: ");
		c = nextInt();
		
		if (a>b)
		{
			if (
			System.out.printf("Los numeros ordenados de mayor a menor son: %d>%d>%d",a,b,c);
		}
		else if(a>c>b)
		{
			System.out.printf("Los numeros ordenados de mayor a menor son: %d>%d>%d",a,c,b);
		}
		else if(b>a>c)
		{
			System.out.printf("Los numeros ordenados de mayor a menor son: %d>%d>%d",	 b,a,c);
		}
		else if(b>c>a)
		{
			System.out.printf("Los numeros ordenados de mayor a menor son: %d>%d>%d",b,c,a);
		}
		else if(c>a>b)
		{
			System.out.printf("Los numeros ordenados de mayor a menor son: %d>%d>%d",c,a,b);
		}
		else 
		{
			System.out.printf("Los numeros ordenados de mayor a menor son: %d>%d>%d",c,a,b);
		}
	}
}