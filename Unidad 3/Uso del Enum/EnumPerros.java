public class EnumPerros
{
	public enum Raza {Mastín, Terrier, Bulldog, Pekines, Caniche, Galgo};
	
	public static void main(String [] args)
	{
		
		//Creacion de variables
		Raza var1 = Raza.Mastín; 
		Raza var2 = Raza.Bulldog;
		String cad;
		
		//Resolucion del problema
		System.out.print("\nVar1 = " + var1 );
		System.out.print("\nVar2 = " + var2 );
		cad = (var1 != var2)?"Son distintas":"Son iguales";
		System.out.printf("\nLas dos razas elegidas " + cad);
		System.out.print("\nLa posición de var 1 es: " + var1.ordinal());
		System.out.print("\nLa posición de var 2 es: " + var2.ordinal());
		System.out.print("\n");
		
	}
}
		
