//Para importar el paquete scaner
import java.util.Scanner;

public class PruebaImportar
{
	public static void main(String [] args)
	{
		//Creamos las variables
		int valor;
		
		//Creamos un objeto de la clase scanner
		Scanner id = new Scanner(System.in);
		
		//pedir valor entero al usuario
		System.out.print("Introduce un valor entero: ");
		
		//Coger el valor que ha introducido el usuario
		valor = id.nextInt();
		
		//Ver ese valor por la pantalla
		System.out.println("Se ha introducido el valor " + valor);
	}
}