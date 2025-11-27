import java.util.Scanner;

public class HoraLlegada
{
	public static void main(String [] args)
	{
		
		//Creacion de variables y objetos
		
		double hora,min,seg,t,tiempo,llegada;
		Scanner sc = new Scanner(System.in);
		
		//Resolucion de problema
		System.out.print("Dime a que hora sale, dime hora: ");
		hora = sc.nextInt();
		
		System.out.print("Dime los minutos: ");
		min = sc.nextInt();
		
		System.out.print("Dime con cuantos segundos: ");
		seg = sc.nextInt();
		
		System.out.print("ahora dime cuanto tarda en llegar en segundos: ");
		t = sc.nextInt();
		
		//Pasamos todo a segundos
		hora = hora * 3600;
		min = min * 60;
		llegada = hora+min+seg+t;
		
		//Pasamos a min etc
		hora = llegada/3600;
		llegada = llegada%3600;
		min = llegada%60;
		llegada = llegada/60;
		seg = llegada;

		System.out.printf("la hora de llegada sera %.2f horas, %.2f minutos y %.2f segundos.",hora,min,seg);
		
	}
}
		
		
		
		
		