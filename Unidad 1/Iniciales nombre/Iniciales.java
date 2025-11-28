import java.util.Scanner;

public class Iniciales
{
	public static void main(String [] args)
	{
		
		//Creacion de variables y objetos
		String nom,ap1,ap2;
		char i1,i2,i3;
		Scanner sc = new Scanner(System.in);
		
		//Solucion del problema
		System.out.printf("\n¿Como te llamas? "); 
		nom = sc.nextLine();
		i1 = nom.charAt(0);
		i1 = Character.toUpperCase(i1);
		
		System.out.printf("¿Cual es tu primer apellido? ");
		ap1 = sc.nextLine();
		i2 = ap1.charAt(0);
		i2 = Character.toUpperCase(i2);
		
		System.out.printf("¿Cual es tu segundo apellido? ");
		ap2 = sc.nextLine();
		i3 = ap2.charAt(0);
		i3 = Character.toUpperCase(i3);
		
		System.out.printf("\nTus iniciales son: "+i1+i2+i3);
		System.out.printf("\n");
		
	}
}
