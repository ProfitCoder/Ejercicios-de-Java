public class PrimerArray
{
	public static void main(String [] args)
	{
		
		//Creacion de variables y objetos
		int suma = 0;
		int var1 = 2, var2 = 4;
		
		//Declaracion de un array 
		int [] array1;
		int [] array2 = {2.3,8.4,0.25};
		
		//Creacion de tamañno 5
		array1 = new int [5];
		
		//Inicialización del array con los 5 primeros números
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;
		
		System.out.print("Suma "+ sumarArrayInt(array1));
		System.out.printf("\nSumar %d+%d = %d",var1,var2,sumar2Valores(var1,var2));
		
		//Para sumar los elementos del array
		//suma = array1 [0]+array1 [1]+array1 [2]+array1 [3]+array1 [4];
		
		// o tambien
		
		//Ademas vemos a crear a variable en el for para que sea de usar  desaparecer
		/*
		for(int i=0;i<array1.length;i++)
			suma += array1[i];
		System.out.print("\nSuma: "+suma);
		*/
		
		//Vamos a sumar los elementros del array utilizando un metodo
		
	}
	//Metodo para sumar los elementos de un array
	// Necesita el static para poder usarlo
	static int sumarArrayInt( int [] array)
	{
		//variables para acumular la suma
		int suma = 0;
		
		//bucle para recorrer el array
		for (int i=0;i<array.length;i++)
		{
			suma += array[i];
		}
		//Devolver el valor con la suma
		return suma;
	}
	
	//Metodo para sumar dos valores
	static int sumar2Valores(int a,int b)
	{
		return a+b;
	}
}

