public class CadenasRotacion
{
	public static void main(String [] args)
	{
		//Creacion del StringBuilder
		int i;
		StringBuilder strb = new StringBuilder("Cadena a rotar");
		
		//Prueba de rotación
		try
		{
			System.out.print("\nCadena original: " + strb);
			System.out.print("\n");
			
			for (i = 0; i < strb.length() ; i++)
			{
				strb.append(strb.charAt(0));
				strb.delete(0,1);
				System.out.print("\nProceso --> " + strb);
			}
			System.out.print("\n");
		}
		catch (Exception e)
		{
			System.out.print("ERROR: " + e);
		}
	}
}