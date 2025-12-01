import java.util.Scanner;

public class NotaSwitch
{	
	public static void main(String [] args)
	{
		
		//Creacion de variables
		char resp;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("¿Como esta el alumno?:\nA-->Excelente\nB-->Notable\nC-->Aprobado\nD-->Insuficiente\nF-->Reprobado\nElige una: ");
		resp = sc.nextLine().toLowerCase().charAt(0);
		
		switch (resp)
		{
			case 'A':
				System.out.print("\nExcelente\n");
				break;
			case 'B':
				System.out.print("\nNotable\n");
				break;
			case 'C':
				System.out.print("\nAprobado\n");
				break;
			case 'D':
				System.out.print("\nInsuficiente\n");
				break;
			case 'F':
				System.out.print("\nReprobado\n");
				break;
			default:
				System.out.print("\nCalifiación no valida.\n");
		}
	}
}