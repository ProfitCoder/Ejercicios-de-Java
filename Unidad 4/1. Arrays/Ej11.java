import java.util.Scanner;
import java.util.Arrays;

public class Ej11
{
	public static void main(String [] args)
	{
		//Creacion de Variables
		String [] colores = {"rojo","amarillo","verde","blanco","azul","negro"};
		Scanner sc = new Scanner(System.in);
		int num,aleatorio;
		
		//Pedir el numero de franjas al usuario
		System.out.print("\n¿Con cuantas franjas quieres la bandera?: ");
		num = sc.nextInt();
		
		//Creacion de la bandera
		System.out.println("\nLos colores de la franja de la bandera son: \n");
		
		for(int i = 0;i < num; i++)
		{
			aleatorio = (int)(Math.random()*6);
			System.out.printf(colores [aleatorio]);
			System.out.print("\n");
		}
	}
}