public class EjemploEuro
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		
		float precio=3.3f;
		//Esto se hace porque el € no se encuentra o sale diferente debido al formato de si operamos en cmd en linux, windows... etc
		String salida = String.format("El precio es de %.2f",precio);
		salida += "€";
		
		//Solucion
		
		System.out.print(salida);
	}
}