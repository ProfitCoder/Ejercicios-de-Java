public class EjemploVariables
{
	public static void main(String[]args)
	{
	//Declaración de variables y objetos
	byte var1=1;
	short var2=128;
	int var3=32768;
	long var4=2147483648L;     //hemos tenido que añador L al final para que funcionara
	
	//Ahora ponemos 2 variables de tipo real
	float var5=10.5F;           //En esta hemos tenido que añadir una F para que funcione bien
	double var6=1080.683;
	
	//Booleanos
	boolean var7=true;
	
	//Caracteres
	char var8='a';
	
	//Resolver el problema
	System.out.println(var1 + "," + var2 + "," + var3 + "," + var4);                      //Se pone asi para que guarde esto del tipo cadena
	
	System.out.println(var5 + "\n" + var6);                          // esa barra n actua igual que un enter

	System.out.println(var7);
	System.out.println(var8);
	
	//Quiero escribir "Que alegría verte"
	System.out.println("\"Que alegria verte\"");                                   //Esto sirve para poner algo entre comillas
	}
}



/*Hemos tenido que añadir una F y una L, el porque: de por si el valor que toma el programa es el int y si no entra nos da error, aunque pongamos long
por lo tanto lo que hacemos es añadir una L alfinal para que distinga bien del todo que el numero es un long.

Y para la F lo que pasa es que como los numeros reales se guardan como aproximaciones es decir si guardo 15.6 no se guarda ese numero, se guarda una 
aproximacion que es muy cercana a ese numero pero no es ese numero. Entonces para que nos lo trate como un double le ponemos la F para que lo trate como
un Float*/
 













