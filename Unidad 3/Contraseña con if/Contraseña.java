import java.util.Scanner;

public class Contraseña
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		String nom1,cont1;
		Scanner sc = new Scanner(System.in);
		
		//Resolución de problemas
		System.out.print("\nIntroduce nombre de usuario: ");
		nom1 = sc.nextLine();
		System.out.print("\nIntroduce una contraseña: ");
		cont1 = sc.nextLine();
		
		if (nom1.equals("pepe") && cont1.equals("asdasd"))				//el primero es true, otro tb asi q true && true 
		{
			System.out.print("\nHas entrado al Sistema\n");
		}
			else 
			{
				System.out.print("\nHas fallado.\n");
			}
	}
}
		
