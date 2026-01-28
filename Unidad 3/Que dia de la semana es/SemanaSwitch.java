import java.util.Scanner;

public class SemanaSwitch
{
	public static void main(String [] args)
	{
		
		//Declaracion de variables
		Scanner sc = new Scanner (System.in);
		int numDia;
		
		//Resolucion de problema
		System.out.print("\nNúmero de día: ");
		numDia = sc.nextInt();
		
		//Utilización del switch
		switch(numDia)
		{
			case 1:
				System.out.print("Lunes\n");
				break;														//Si no pones un break sigue leyendo
			case 2:
				System.out.print("Martes\n");
				break;
			case 3:
				System.out.print("Miercoles\n");
				break;
			case 4:
				System.out.print("Jueves\n");
				break;
			case 5:
				System.out.print("Viernes\n");
				break;
			case 6:
				System.out.print("Sabado\n");
				break;
			case 7:
				System.out.print("Domingo\n");
				break;
			default:
				System.out.print("Dia incorrecto\n");
		}		
	}
}
