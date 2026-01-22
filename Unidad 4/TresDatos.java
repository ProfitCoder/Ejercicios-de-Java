import java.util.Scanner;

public class TresDatos
{
	public static void main(String [] args)
	{
		
		//Variables
		String nombre,direccion;
		int telefono;
		Scanner sc = new Scanner(System.in);
		
		//Solucion
		System.out.print("¿Como te llamas?: ");
		nombre = sc.nextLine();
		System.out.print("¿Cual es tu dirección?: ");
		direccion = sc.nextLine();
		System.out.print("¿Cual es tu numero de Telefono?:");
		telefono = sc.nextInt();
		
		System.out.print("\nTe llamas: "+nombre+" y vives en la direccion: "+direccion+", además tu numero de telefono es:"+telefono+" gracias\n");
	}
}