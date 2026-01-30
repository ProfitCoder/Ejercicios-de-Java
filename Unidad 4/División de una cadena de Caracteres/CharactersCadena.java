public class CharactersCadena
{
	public static void main(String [] args)
	{
		
		//Variables
		int i;
		String cadena = new String ("¿Hola que tal estais?");

		//Solucion
		for(i=0;i<cadena.length();i++)
		{
			System.out.print("\n"+cadena.charAt(i));
		}
		System.out.print("\n");
	}
}
