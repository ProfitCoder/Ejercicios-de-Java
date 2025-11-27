import java.util.Scanner;

public class OperadoresRelacionales
{
	public static void main(String [] args)
	{
		
		int x,y;
		String cadena;
		boolean resultado;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		cadena=(x==y)?"iguales":"distintos";
		System.out.printf("\n los números %d y %d son %s\n",x,y,cadena);
		
		resultado=(x!=y);
		System.out.printf("\n x != y // es "+resultado);
		
		resultado=(x<y);
		System.out.printf("\n x < y // es "+resultado);
		
		resultado=(x>y);
		System.out.printf("\n x > y // es "+resultado);
		
		resultado=(x<=y);
		System.out.printf("\n x <= y // es "+resultado);
		
		resultado=(x>=y);
		System.out.printf("\n x >= y // es "+resultado );
		
		System.out.printf("\n");
	}
}