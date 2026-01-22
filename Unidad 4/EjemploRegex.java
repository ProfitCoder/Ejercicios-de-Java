//Esto se utiliza par importar la clase regex
import java.util.regex.*;

public class EjemploRegex
{
	public static void main(String [] args)
	{
		//Creacion de variables
		//Comprobamos cual de estas cadenas cumple el patron
		String numBinario1 = "000100110";
		String numBinario2 = "1100210011";
		
		//Cumple esta condicion
		String patron = "[01]+";
		
		//Resolucion del problema
		Pattern p = Pattern.compile(patron);
		Matcher m = p.matcher(numBinario1);
		
		if(m.matches())
		{
			System.out.print("\nNumero binario correcto.");
		}
		else
		{
			System.out.print("\nNumero binario incorrecto.");
		}
	}
}