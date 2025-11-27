public class EjemploChar
{
	public static void main(String [] args)
	{
		
		//Creacion de variables
		int num;
		char c;						/*Ahora mismo no da error esta variable
									porque no esta inicializada*/
									
		//Resolución del problema
		num = (int)'A';
		System.out.printf("num = %d\n");
		
		num += 1;
		c = (char)num;
		System.out.printf("c = %c",c);			//ese +1 en la tabla unicode hace de la a sea una b
		
	}
}
