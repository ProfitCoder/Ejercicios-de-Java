public class Ej_String
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		char letra;
		String cad1 = "Esto es una String",cad2 = "Y esto también",cad3,cad4;
		int caracteres = 0,i;
		
		//Solución
		try
		{
			//Comparación de si son iguales
			if(cad1 == cad2)
			{
				System.out.print("\nSon iguales.");
			}
			else
			{
				System.out.print("\nNo son iguales.");
			}
			
			//Concatenación
			cad3 = cad1.concat(cad2);
			System.out.print("\n"+cad3);
			
			//Concatenación otra vez
			cad4 = cad3;
			System.out.print("\n"+cad4);
			
			//Comparación
			if (cad3 == cad4)
			{
				System.out.print("\nSon iguales.");
			}
			else
			{
				System.out.print("\nNo son iguales.");
			}
			
			//Cuantos caracteres tiene cada string
			for(i=0;i<cad1.length();i++)
			{
				letra = cad1.charAt(i);
				caracteres+=1;
				System.out.print("\n");
			}
			
		}
		catch (Exception e)
		{
			System.out.print("\nERROR: "+e);
		}
	}
}
		
