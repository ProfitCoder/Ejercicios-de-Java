public class VariablesEj5
{
	public static void main(String [] args)
	{
		
		//Creación e inicialización de variables u objetos
		char a='a',b='b',c='c',d='d',e='e';
		String cad;
		//Resolución del problema
		//El error que encuentro es que no puedo sumar los char porque los pasa a int.
		cad = ""+a+b+c+d+e;
		
		//Se ha solucionado metiendo un espacio para q lea String, y ya lo demas lo tome como String
		
		System.out.printf("\nConcatenación: " + cad);	
		System.out.print("\n");
		
	}
}
		