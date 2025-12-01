import java.util.Scanner;

public class PuntosPlano
{
	public static void main(String [] args) 
	{
		
		//Creacion de variables y objetos
		double x1,y1,x2,y2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime los dos valores de la primera coordenada: ");
		System.out.print("Dime la X1 ");
		x1 = sc.nextDouble();
		System.out.print("Dime la Y1 ");
		y1 = sc.nextDouble();
		
		System.out.print("Dime la X2 ");
		x2 = sc.nextDouble();
		System.out.print("Dime la Y2 ");
		y2 = sc.nextDouble();
		
		
		System.out.printf("La distancia entre un punto y otro es %.2f.",Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2))));
		
	}
}
		/*para calcular la distancia hay que 
		la raiz cuadrada de (x2-x1)al cuadrado y (y2 -y1)al cuadrado */
