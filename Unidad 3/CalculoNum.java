import java.util.Scanner;

public class CalculoNum
{
	public static void main(String [] args)
	{
		
		//Creacion de variables 
		int numin=0;
		double num,total=0,media,suma;
		Scanner sc = new Scanner(System.in);
		
		
		//Solución del problema
		
		System.out.print("\nDame varios numeros para sumarlos y hacerles la media, (terminare de perdir numeros cuando me des el 0)");
		
		do 
		{
			System.out.print("\nDame un numero: ");
			num = sc.nextDouble();
			total = total + num;
			numin = numin +1;
		}
		while (num != 0);
		
		numin = numin-1;
		suma = total;
		media = total/numin;
		System.out.print("\nHas terminado el programa");
		System.out.printf("\nLa suma de los numeros que has metido es %.2f.\nLa media de los numeros introducidos es %.2f.",suma,media);
		System.out.print("\n");
	}
}