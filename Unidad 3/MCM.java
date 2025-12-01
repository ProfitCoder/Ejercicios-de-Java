import java.util.Scanner;

public class MCM
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		int num1,num2,mcm;
		Scanner sc = new Scanner(System.in);
		
		//Solucion
		try
		{
			System.out.print("\nDime dos números, para hacerle el MCM (Mínimo común multiplo).\nNúmero  1: ");
			num1 = sc.nextInt();
			System.out.print("Dime el número 2: ");
			num2 = sc.nextInt();
			
			if (num1 >= 0 && num2 >= 0)
			{			
				if (num1 == num2)
					mcm=num2;
				else
					if (num1<num2)
						mcm=num2;
					else
						mcm=num1;
					while ((mcm%num1) != 0 || (mcm%num2) != 0)
					{
						System.out.printf("\nPruebo %d",mcm);
						mcm+=1;
					}
					System.out.printf("\nEl MCM de los numeros (%d,%d) es %d",num1,num2,mcm);
			}
			else 
			{
				System.out.print("Los numeros tienen que ser postivos, no me vale ese ejemplo.");
				System.out.print("\n");
			}
		}
		catch (Exception e)
		{
			System.out.print("ERROR:"+e);
		}
	}
}