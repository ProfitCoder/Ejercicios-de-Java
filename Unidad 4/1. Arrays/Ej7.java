import java.util.Scanner;
import java.util.Arrays;

public class Ej7
{	
	public static void main(String [] args)
	{
		//Creacion de Variables
		int [] temperaturas = new int [12];
		enum Meses{Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre};
		int i=0;
		Scanner sc = new Scanner(System.in);
		
		//Uso del for in
		for(Meses mes : Meses.values())
		{
			System.out.printf("\nDime la temperatura del mes %s :",mes);
			temperaturas[i] = sc.nextInt();
			i++;
		}
		
		//Mostramos el diagrama de barras
		
		i = 0;
		for(Meses mes : Meses.values())
		{
			System.out.print("\n"+mes+": ");
			for(int suma = 0;suma < temperaturas[i];suma++)
			{
				System.out.print("*");
			}
			i++;
		}
	}
}