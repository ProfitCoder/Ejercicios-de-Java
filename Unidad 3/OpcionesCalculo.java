import java.util.Scanner;

public class OpcionesCalculo
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		int a,b,op,op1,op2,op3;
		double op4;
		Scanner sc = new Scanner(System.in);
		
		//Resolución del problema
		System.out.print("\nDime un numero: ");
		a = sc.nextInt();
		System.out.print("\nDimer otro numero: ");
		b = sc.nextInt();
		System.out.print("\nQue quieres que haga con estos numeros:\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n¿Cual quieres?:");
		op = sc.nextInt();
		
		switch (op)
		{
			case 1:
				op1 = (a+b);
				System.out.printf("La suma entre %d y %d es %d.\n",a,b,op1);
				break;
			case 2:
				op2 = (a-b);
				System.out.printf("La resta entre %d y %d es %d.\n",a,b,op2);
				break;
			case 3:
				op3 = (a*b);
				System.out.printf("La multiplicación entre %d y %d es %d.\n",a,b,op3);
				break;
			case 4:
				op4 = (a/(double)b);
				System.out.printf("La división entre %d y %d es %.2f.\n",a,b,op4);
				break;
			default:
				System.out.print("Ese numero no esta entre las opciones.\n");
		}
	}
}