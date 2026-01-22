public class Ej3
{
	public static void main(String [] args)
	{
		//Creacion de variables
		int [] numero = new int [20];
		int [] Cuadrado = new int [20];
		int [] Cubo = new int [20];
		
		
		System.out.print("\n_________________________\n|Numero |Cuadrado|Cubo  |\n_________________________");
		
		for(int i = 0;i<numero.length;i++)
		{
			numero [i] = (int)(Math.random()*(100+1));
			Cuadrado [i] = (int)(Math.pow(numero[i],2));
			Cubo [i] = (int)(Math.pow(numero [i],3));
			System.out.printf("\n|%7d|%7d|%7d|",numero [i],Cuadrado [i],Cubo [i]);
		}
		System.out.print("\n__________________________");
	}
}
		
		