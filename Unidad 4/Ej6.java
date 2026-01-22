import java.util.Scanner;
import java.util.regex.*;

public class Ej6
{
	public static void main(String [] args)
	{
		//Variables						el [^()] Significa que no puede aparecer	aparece para el principio y para elfinal	
		String patron = "[^(\\.)][a-z\\d\\-\\_\\.]+[^\\.][@]";
		String patron2 = "([^(\\-)][a-z0-9\\-]+[^(\\-)][\\.])+[a-z]{2,3}";
		String email;
		char salida2='s';
		Scanner sc = new Scanner(System.in);
		
		//Solucion
		do
		{
			System.out.print("\nEmpezamos a validar o salimos del programa? (e/s): ");
			salida2 = sc.nextLine().toLowerCase().charAt(0);

			if (salida2 != 's')	
			{
				System.out.print("\nEscribe un correo electronico: \n-");
				email = sc.nextLine();
				
				int length();
				
				Pattern p = Pattern.compile(patron+patron2);
				Matcher m = p.matcher(email);
				
				if (m.matches())
				{
					System.out.print("\nEl email esta en un formato correcto.");
				}
				else
				{
					System.out.print("\nEl email esta incorrecto.");
				}
			}
		}
		while (salida2 != 's');
		System.out.print("\nEl programa ha acabado.\n");
	}
}