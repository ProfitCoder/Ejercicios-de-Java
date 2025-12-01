import java.util.Scanner;

public class Sueldo
{
	public static void main(String [] args)
	{
		
		//Creacion de variables y objetos. PRIMERA VEZ USANDO UNA CONSTANTE
		int SueldoBase,venta1,venta2,venta3;
		double TotalComision,SueldoFinal;
		final double COMISION = 0.1;			//final... es para variables y tiene que ser mayuscula el nombre
		Scanner sc = new Scanner(System.in);
		
		//Resolucion del problema 
		System.out.print("Introduce el sueldo base: ");
		SueldoBase = sc.nextInt();
		
		System.out.print("\n Introduce la primera venta: ");
		venta1 = sc.nextInt();
		
		System.out.print("\n Introduce la segunda venta: ");
		venta2 = sc.nextInt();
		
		System.out.print("\n Introduce la tercera venta: ");
		venta3 = sc.nextInt();
		
		TotalComision = ((venta1+venta2+venta3)*COMISION);
		SueldoFinal = venta1+venta2+venta3+SueldoBase;
		
		System.out.print("\nTus sueldo base es: " + SueldoBase);
		System.out.print("\nTus comisiones son: " + TotalComision);
		System.out.print("\nEl sueldo final es: " + SueldoFinal);
		System.out.print("\n");
		
	}
}
