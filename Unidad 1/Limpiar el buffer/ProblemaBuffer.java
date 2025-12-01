import java.util.Scanner;

public class ProblemaBuffer
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		int x;
		String cad;
		Scanner sc = new Scanner(System.in);
		
		//Problema
		
		//Para poder arreglar y que no haga falta el buffer transformamos la cadena a int asi:
		System.out.print("Valor entero: ");
		x = Integer.parseInt(sc.nextInt());
		
		//Limpiar el buffer del \nCadena. Y ya esto hace que el buffer se limpie y ya no ocurran problemas
		sc.nextLine();
		
		System.out.print("\nCadena: ");					//No la coge porque las cadenas acaban con \n y no lo detecta, para solucionar limpiar el buffer.
		cad = sc.nextLine();
		
		System.out.printf("x = %d y cad = %s\n",x,cad);
		
		//Para pasar una cadena a num
		
		num = String.valueOf(28)
		System.out.printf("\nnum = %d", num);				//Nos pasa de entero a int
		
	}

}
