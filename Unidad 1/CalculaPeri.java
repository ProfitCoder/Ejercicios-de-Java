import java.util.Scanner;

public class CalculaPeri
{
	public static void main(String [] args)
	{
		
		/*Sabiendo que Perimetro = (base*2) + (Altura*2)
		Y Area = Base x Altura*/
		
		//Variables y objetos
		
		Double base,Altura;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime de cuanto quieres que sea la base: "); 
		base = sc.	nextDouble();
		System.out.print("Dime de cuanto quieres que sea la altura: ");
		Altura = sc.nextDouble();
		
		//Resolucion de problema
		
		
		System.out.printf("\n El perimetro es: " + (2*base + 2*Altura));
		System.out.printf("\n La base es: " + (base*=Altura));
		System.out.printf("\n");
	}
}
		