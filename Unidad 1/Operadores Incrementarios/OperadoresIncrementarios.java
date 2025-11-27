public class OperadoresIncrementarios
{
	
	/* Aqui vamos a ver el uso del ++ y del --, es decir
	de operadores incrementarios*/

	public static void main(String [] args)
	{
		//Declaramos tres variables de tipo entero
		
		int x=3,y,z;
		
		y=++x;												//Al ponerlo delante se incrementa en valor de x y se lo da a y
		System.out.println("x ="+x);
		System.out.println("y="+y);
		
		z=x++;												//Lo que pasa aqui es que se le da el valor de x en ese momento a z y luego se incrementa x
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
	}
}
