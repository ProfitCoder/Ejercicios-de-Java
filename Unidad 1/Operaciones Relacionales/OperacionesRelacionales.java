import java.util.Scanner;

public class OperacionesRelacionales
{
	public static void main(String [] args)
	{
		
		//Creación de variables y objetos 
		int x,y;
		boolean verificar;
		Scanner sc = new Scanner(System.in);
		
		//Resolucion del problema
		//condicion?:(condicion true):(condicion false);
		
		System.out.print("Dame dos numeros, primero x: ");
		x = Integer.parseInt(sc.nextLine());
		
		System.out.print("Ahora y: ");
		y = sc.nextInt();
		
		verificar = (x==y);
		System.out.println(x +" es igual a "+ y +"? "+ verificar);
		
		verificar = (x != y);
		System.out.println(x + " son diferentes " + y +"? " + verificar);
		
		verificar = (x > y);
		System.out.println(x + " es mayor que " + y +"? " + verificar);
		
		verificar = (x < y);
		System.out.println(x + " es menor que " + y +"? " + verificar);
		
		verificar = (x >= y);
		System.out.println(x + " es mayor o igual que " + y +"? " + verificar);
		
		verificar = (x <= y);
		System.out.println(x + " es mayor o igual que " + y +"? " + verificar);

	}
}
