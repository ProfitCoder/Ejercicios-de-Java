import java.util.Arrays;

public class MiPrimeraMatriz
{
	public static void main(String [] args)
	{
		//Creacion de variables
		double [][] matrizDouble = new double [2][2];
		int [][] matrizInt = {{1,2},{3,4}};
		
		//Añadir valores al array
		matrizDouble[0][0] = 5;
		matrizDouble[1][1] = 5;
		
		//Mostrar valores por pantalla
		for(int fila = 0;fila < matrizDouble.length;fila++)
		{
			for(int col = 0;col < matrizDouble[fila].length;col++)
				System.out.printf("%.2f ",matrizDouble[fila][col]);
				System.out.println();
		}
		
		//Sumar dos elementos
		double suma = matrizDouble[0][0] + matrizDouble[1][1];
		System.out.print(suma);
	}
}