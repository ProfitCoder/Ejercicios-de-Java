import java.util.Scanner;

public class NotaEstudiante
{
	public static void main(String [] args)
	{
		
		//Creación de variables y objetos
		int bi,m,b,n1,n2,n3,nf;
		Scanner sc = new Scanner(System.in);
		
		//Resolución de problema
		System.out.print("\nDime cuantas respuestas ha tenido bien: ");
		bi = sc.nextInt();
		
		System.out.print("\nDime cuantas mal: ");
		m = sc.nextInt();
		
		System.out.print("\nDime cuantas ha dejado en blanco: ");
		b = sc.nextInt();
		
		n1 = bi*5;
		n2 = m*-1;
		n3 = b*0;
		nf = n1+n2+n3;
		
		System.out.printf("\nLa nota final es %d",nf);
		
	}
}
