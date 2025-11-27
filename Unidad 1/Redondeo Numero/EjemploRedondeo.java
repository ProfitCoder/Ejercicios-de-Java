public class EjemploRedondeo
{
	public static void main(String [] args)
	{
		
		//Creación de variables
		double d = 45.95;
		int x;
		
		//Resolución de problemas
		x = (int)Math.round(d);
		System.out.printf("Redondeado al mas cercano %d",x);
		
		x = (int)Math.ceil(d);
		System.out.printf("Redondeado a la alza %d",x);
		
		x = (int)Math.floor(d);
		System.out.printf("Redondeado a la baja %d",x);
		
	}
}
		
		
