public class SalidaFormateada
{
	public static void main(String [] args)
	{
		System.out.printf("El número %d no tiene decimales.\n", 21);
		System.out.printf("El número %f sale con decimales.\n", 21.0);
		System.out.printf("El número %.3f sale exactamente con 3 decimales.\n", 21.0);
		
	}
}


/* Los marcadores de printf

%d es de numeros enteros
%f es de numeros reales

Si pongo %.3f estoy indicando en nº de decimales que quiero que el programa me saque


tambien esta %s que es para las cadenas

%-10s indica la longitud de caracteres que va a tener a palabra o lo que vaya escrito para que se haga en forma de tabla
y el - indica alineación a la izquierda

%8.2s Aqui indica que la palabra tiene una longitud de caracteres de 8 y que tiene 2 decimales

&6d indica los caracteres que son 6

*/