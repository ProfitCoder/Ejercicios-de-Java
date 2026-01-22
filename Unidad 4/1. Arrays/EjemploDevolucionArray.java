//Ejemplo de metodo para devolver un array

public class EjemploDevolucionArray
{
	public static void main(String [] args)
	{
		//Creacion de variables
		int array[];
		
		//Inicializacion de array usando metodo
		array = ArrayConNumerosConsecutivos(2);
			for(int i=0;i<array.length;i++)
			{
				System.out.print("\n"+array [i]);
			}
	}
		//Metodo que devuelve un array inicializado
		static int [] ArrayConNumerosConsecutivos (int totalNumeros)
		{
			int [] r=new int [totalNumeros];
				for(int i=0;i<totalNumeros;i++)
				{
					r[i] = i;
				}
				
					return r;
		}
}