import java.util.Scanner;

public class OrdenarAlfabeticamente
{
	public static void main(String [] args)
	{
		
		//Creacion de variables y objetos
		String cad1="Juan",cad2="Ana";
		int i;
		boolean ordenado = false;
		
		//Opción 1 con un bucle
		/*Esta condicion no me vale ya que si cad2 es mas larga que cad1 nos da un error
		porque llega hasta el final del nombre y si este termina antes pues da error */
		/*for(i=0;i<cad2.length() && !ordenado;i++)
		{
			c1=cad1.chatAt(i);
			c2=cad2.charAt(i);
			if (c1<c2)
				System.out.print(cad1+" - "+cad2);
				ordenado=true;
			else
				if(c1>c2)
					System.out.print(cad2+" - "+cad1);
					ordenado=true;
		}
		if(c1==c2)
		{
			System.out.print("Son iguales");
		}
		*/
		//Opcion 2 uso del Compare
		if (cad1.compareTo(cad2)<0)
			System.out.println(cad1 + " - " + cad2);
		else
			if(cad1.compareTo(cad2)>0)
				System.out.print(cad2 + " - " + cad1);
			else 
				System.out.print("Son iguales");
		
	}
}