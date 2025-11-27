import java.util.Scanner;

public class GradosC
{
	public static void main(String [] args)
	{
		
		//Definicion de variables
		double x;
		Scanner sc = new Scanner(System.in);
		double grados;
		
		//Resolucion de problema
		System.out.println("Dime un numero de Faharenheit y lo pasare a Celsius: ");
		x = sc.nextDouble();
		
		grados = ((x-32)*5/9);
		System.out.printf("Los Faharenheit %.2f a Celsius son %.2f", x,grados);
		
	}
}
		