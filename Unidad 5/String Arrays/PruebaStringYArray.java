import java.util.Scanner;
import java.util.Arrays;

public class PruebaStringYArray{
	public static void main(String [] args){
		//Variables
		String cad1,cad2,resp;
		int opc = 0,tam = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cual es el metodo que quieres ejecutar, (1,2,3) el 0 es para salir.");
		opc = Integer.parseInt(sc.nextLine());
		
		//Resoluciones
		switch (opc){
			case 0:
				System.out.println("Fin del programa.");
				break;
			case 1:
				System.out.print("Dime dos cadenas para concatenarlas: ");
				cad1 = sc.nextLine();
				System.out.println("\nAhora la otra cadena: ");
				cad2 = sc.nextLine();
				
				System.out.println(StringYArray.cadenasConcat(cad1,cad2));
				break;
			case 2:
				System.out.print("\nDime una cadena para convertirla en Array: ");
				cad1 = sc.nextLine();
				
				System.out.println(Arrays.toString(StringYArray.stringArray(cad1)));
				break;
			case 3:
				/*
				System.out.println("Vamos a rellenar un array, y lo convertiremos en cadena");
				System.out.println("De que tamaño quieres el Array");
				tam = Integer.parseInt(sc.nextLine());
				*/
				char [] arrayACadena ={'h','o','l','a',' ','#','&','7','5','2'};
				
				/*
				System.out.printf("\nDime los valores para tu array de %d huecos",tam);
				for(int i = 0;i < tam;i++){
					resp = sc.nextLine();
					arrayACadena [i] += resp;
				}
				*/
				System.out.println(StringYArray.convierteArrayEnString(arrayACadena));
				break;
				
			default:
			System.out.println("Opción incorrecta.");
		}
	}
}