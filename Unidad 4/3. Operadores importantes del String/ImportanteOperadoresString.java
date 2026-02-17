import java.util.Scanner;		
		
public class ImportanteOperadoresString
{
	public static void main(String [] args)
	{		
		String cad1 = "      En un lugar de la Mancha....mancha         ";
		
		//El cad1.trim elimina los espacios en blanco de la cadena anteriores y posteriores
		
		String cad2 = cad1.trim();
		
		System.out.println(cad1);
		System.out.println(cad2);
		
		/*
		indexOf, sirve para realisar busquedas de una palabra concreta y 
		te da la posicion y si nos devuelve -1 es que no la encuentra
		Si no queremos problemas con mayus y minus, podemos poner un 
		cad1.toLowerCase antes del indexOf ya que convierte toda 
		la cadena 1 en minuscula
		*/
		
		System.out.println(cad1.indexOf("Mancha"));
		
		/*
		Esto solo devuelve la primera vez que sale 
		si quieres que te diga todos tienes que hacer
		un bucle
		*/
		
		//Quedaria como:
		
		System.out.println(cad1.toLowerCase().indexOf("mancha",19));
		
		/*
		devuelve verdadero o falso si la cadena 
		empieza con lo que le he pasado
		*/
		
		System.out.print(cad1.startsWith("En un lugar");
		
		
		//En este caso si esta bien dice true, si no false
		
		
		//Tambien existe el endsWith
		
		
		System.out.print(cad1.endsWith("mancha");
		
		//Este replaca una palabra que se indica por la otra
		
		System.out.print(cad1.replace("Mancha","Granada"));
	}

}
