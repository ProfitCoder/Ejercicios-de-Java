//Vamos a probar los ejercicios de 
public class Ej1
{
	public static void main(String [] args)
	{
		//Creacion de variables		Se puede poner String, char, int cualquier valor para los arrays
		String [] num;
		num = new String [12];
		
		num [0] = "a";
		num [1] = "b";
		num [4] = "g";
		num [6] = "s";
		num [8] = "b";
		num [9] = "b";
		
		//Que pasara con las posiciones que no tienen ningún valor
		for(int i = 0;i<num.length;i++)
		{
			System.out.println(num [i]);
		}			
		/*Despues de compilar y ejecutar vemos que no se imprime
		y depende de lo que se meta donde no hay nada aparece:
		int = 0
		char = ' '
		String = null
		*/
	}
}