public class EjemploStringBuilder
{
	public static void main(String [] args)
	{
		//Creación del StringBuilder
		StringBuilder strb = new StringBuilder("Hoal Muuundo");
		
		//Distintos usos del StringBuilder
		System.out.print("\nOriginal: " + strb + ", con tamaño de " + strb.length());
		
		//Delete elimina desde la posición que le diga hasta la actual
		strb.delete(6,8);
		
		/*
		Esto lo que hace es eliminar las palabras de las posiciones 6 a la 8
		sobreescribre dentro de la misma variable sin necesidad de tener que 
		crear otra nueva variable
		*/
		System.out.print("\nUsando delete: " + strb + ", con tamaño de " + strb.length());
		
		//Ademas podemos añadir al string usando el comando .append
		strb.append("!");
		System.out.print("\nUsando .append : " + strb + ", con tamaño de " + strb.length());
		
		/*
		Este metodo insert sirve para poder insertar en la posición 
		que se le indique el caracter o los caracteres de la continuación
		*/
		strb.insert(0,"¡");
		System.out.print("\nUsando insert : " + strb + ", con tamaño de " + strb.length());

		//Este metodo replace sirve para reemplazar desde la posición 3 a la 5
		strb.replace(3,5,"la");
		System.out.print("\nUsando replace para sustituir: " + strb + ", con tamaño de " + strb.length());
		
		System.out.print("\n");
	}
}
