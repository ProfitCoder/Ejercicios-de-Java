import java.awt.Rectangle;

public class MiPrimeraClase
{
	public static void main(String [] args)
	{
		//Creamos un rectángulo
		Rectangle r1 = new Rectangle(50,50,150,150);
		
		//Mostrar por pantalla 
		System.out.println(r1);
		
		//Para cambiar los valores (alto y ancho)
		r1.height = 100;
		r1.width = 100;
		
		//Mostramos por pantalla con cambios
		System.out.println(r1);
		
		//Aunque mejor se usan para cambiar los set, asi:
		r1.setSize(200,200);
		System.out.println(r1);
		
		//Ahora vamos a probar el equals, asi que creamos otro rectangulo
		Rectangle r2 = new Rectangle(250,250);
		System.out.println(r2);
		
		//Para comparar si son iguales dos rectangulos
		if(r1.equals(r2))
		{
			System.out.println("\nSon iguales");
		}
		else
		{
			System.out.println("No son iguales");
		}
	}
}