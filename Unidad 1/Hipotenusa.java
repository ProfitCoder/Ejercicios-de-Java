import java.util.Scanner;

public class Hipotenusa
{
	public static void main(String [] args)
	{
		
		//Variables y objetos
		
		double C1, C2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el valor del 1º cateto: ");
		C1 = sc.nextDouble();
		System.out.print("Introduce el valor del 2º cateto: ");
		C2 = sc.nextDouble();
		
		/*Math.sqrt() sirve para hacer la raiz cuadrada de lo que hay entre parentesis
		El Math.pow sirve para elevar un numero de la izquierda a el de la derecha*/
		
		System.out.printf("El valor de la hipotenusa es: %.3f" + Math.sqrt(Math.pow(C1,2)+ Math.pow(C2,2)));
	
		//El %.3f es para sacar el numero resultado con 3 decimales
	}
}
		