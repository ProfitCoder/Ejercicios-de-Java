public class MetodoMult
{

	//Creacion de metodo
	
	static void tablaMultiplicar(int num)
	{
		//Creación de variables
		int b=-1,res;
		
		do 
		{
			b++;
			res = b*num;
			System.out.printf("\n%d x %d = %d",num,b,res);
		}
		while (b<10);
			System.out.print("\n\nYa he terminado la tabla.");
			System.out.print("\n");
	}
	
	public static void main(String [] args)
	{
		tablaMultiplicar(1);
		tablaMultiplicar(2);
		tablaMultiplicar(3);
		tablaMultiplicar(4);
		tablaMultiplicar(5);
	}
}