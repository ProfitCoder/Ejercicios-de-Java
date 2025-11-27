import java.util.Scanner;

public class VehiculosRapidos
{
	public static void main(String [] args)
	{
		
		//Creacion de Variables y objetos
		int d,v1,v2;
		double t;
		Scanner sc = new Scanner(System.in);
		
		//Resolucion del problema
		System.out.print("A que velocidad va el 1º coche en km/h: ");
		v1 = sc.nextInt();
		
		System.out.print("Y el segundo? ");
		v2 = sc.nextInt();
		
		System.out.print("A que distancia esta inicialmente en km: ");
		d = sc.nextInt();
		
		t = (d/(v1-v2));
		t= t*60;
		
		System.out.printf("El coche 1 tardara en pillar al coche 2 %.2f minutos." , t);
		
	}
}

