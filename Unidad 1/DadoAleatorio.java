import java.util.Scanner;

public class DadoAleatorio
{
	public static void main(String [] args)
	{
		
		//Creación de variables y objetos		El int es un casting para obligar que el resultado sea un int, ya que determinado el random devuelve un double
		int num = (int)(Math.random()*(6-1+1)+1);
		
		//Resolución del problema
		System.out.println("\nGenerado: "+num);
		
	}
}