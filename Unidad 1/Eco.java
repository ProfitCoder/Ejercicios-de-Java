import java.util.Scanner;
// importamos la clase de Scanner 

public class Eco
{
	public static void main(String [] args)
	{
		//Declarcion de variables
		int valor;
		String sc;
		
		//Inicialización
		Scanner id = new Scanner(System.in);
		
		//Resolucion del problema
		System.out.println("hola dime algo y te lo repertire: ");		
		valor = id.nextInt();
		System.out.print(valor);
		sc = id.nextLine();
		System.out.println(sc);
		
	}
}