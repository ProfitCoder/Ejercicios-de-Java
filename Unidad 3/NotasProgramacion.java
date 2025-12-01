import java.util.Scanner;

public class NotasProgramacion
{
	public static void main(String [] args)
	{
		
		//Creación variables
		int notaP,notaE,notaO;
		final int EC = 10,PR = 30, PE = 60;
		double media;
		Scanner sc = new Scanner(System.in);
		
		//Solución
		try
		{
			do
			{
				System.out.print("Dime una nota para el apartado de Practica: ");
				notaP = sc.nextInt();
				System.out.print("Dime una nota para el apartado de Pruebas Especificas: ");
				notaE = sc.nextInt();
				System.out.print("Dime una nota para el apartado de Observaciones: ");
				notaO = sc.nextInt();
				media = ((notaP*PR)/100)+((notaE*PE)/100)+((notaO*EC)/100);
				
				if (notaE>=5)
				{
					System.out.print("\nTu media es = "+media);
				}
				else
				{
					if (media <= 4)
					{
						System.out.print("\nTu media es = "+media);
					}
					else
					{
						System.out.print("\nTu media es 4");
					}
				}
			}
			while (notaP >10 || notaE > 10 || notaO > 10 || notaP < 0 || notaE < 0 || notaO < 0);
			
			System.out.print("\nFin.");
			
		}
		
		catch (Exception e)
		{
			System.out.print("ERROR: "+e);
		}
		
		
	}
}
				