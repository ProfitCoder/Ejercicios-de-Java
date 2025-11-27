import java.util.Scanner;

public class CalificacionFinal
{
	public static void main(String [] args)
	{
	
		//Creacion de variables y Objetos
		double nota1,nota2,nota3,examenf,trabajof,media1,media2,media3,notaf;
		Scanner sc = new Scanner(System.in);
		final double P1=0.55,P2=0.30,P3=0.15;
		
		//Solucion del problema
		System.out.print("¿Cual es la nota de tu 1er examen? ");
		nota1 = sc.nextDouble();
		
		System.out.print("¿Y la de tu 2ndo examen?");
		nota2 = sc.nextDouble();
		
		System.out.print("¿Y el 3ero?");
		nota3 = sc.nextDouble();
		
		System.out.print("¿Y que has sacado en el examen final?");
		examenf = sc.nextDouble();
		
		System.out.print("¿Y en el trabajo final?");
		trabajof = sc.nextDouble();
		
		media1 = (((nota1+nota2+nota3)/3)*P1);
		media2 = (examenf * P2);
		media3 = (trabajof * P3);
		notaf = (media1 + media2+ media3);
		
		System.out.printf("tu nota final del curso sera: %.2f" , notaf);
		
	}
}
		
