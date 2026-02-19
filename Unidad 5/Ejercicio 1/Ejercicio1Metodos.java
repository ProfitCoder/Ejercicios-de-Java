import java.util.Scanner;

public class Ejercicio1Metodos{
	private boolean primo = false;

	//Metodos static
	//1. Crea un metodo que no reciba nada como párametro y no devuelva nada.
	public static void noDevuelveNada(){
		
	}
	
	//2. Crea un metodo que reciba como parámetro un entero y devuelva ese entero incrementado en 1.
	public static int incrementoNumero(int num){
		num++;
		return num;
	}
	
	//3. Crea un método que reciba dos flotantes y devuelva la suma de los dos.
	public static float sumaDosNumeros(float num1, float num2){
		return (float)(num1 + num2);
	}
	
	//4. Crea un método llamado "limpiarPantalla", que borre la pantalla dibujando 25 líneas en blanco.
	public static void limpiarPantalla(){
		String limpio = "";
		for(int i = 0;i < 25;i++)
			System.out.println();
	}
	
	//5. Crea un método llamado "dibujarCuadrado" que recibe un valor entero N y dibuja un cuadrado formado por N filas con N asteriscos cada una.
	public static void dibujarCuadrado(int cuadradoLado){
		for(int fila = 0;fila < cuadradoLado;fila++){
			for(int col = 0;col < cuadradoLado;col++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//6. Crea un método llamado "obtenerSigno", que reciba un número real, y devuelva un número entero con el valor: -1 si el numero es negativo, 1 si es positivo o 0 si es cero.
	public static int obtenerSigno(double numeroSigno){
		double valor;
		
		if(numeroSigno < 0){
			valor = -1;
		}
		else if(numeroSigno > 0){
			valor = 1;
		}
		else{
			valor = 0;
		}
		return (int)valor;
	}
	
	//7. Crea un método que reciba un entero y devuelva su factoria.
	public static int factorialNumero(int numFactorial){
		
		for (int i = numFactorial-1;i > 0;i--)
		{
			numFactorial *= i;
		}
		return numFactorial;
	}
	
	//8. Crea un método que reciba un entero y "nos diga" si es primo o no
	
	public static boolean primoONo(int num){
		boolean primo = true;
		
		if (num <= 1){
			primo = false;
		}
		else{
			for(int i = num-1;i > 1 && primo == true;i--){
				if(num%i == 0){
					primo = false;
				}
			}
		}
		return primo;
	}
	
	//9. Crea un método que reciba un entero y devuelva ese entero si es un número primo o 0 en cualquier otro caso. Tiene que usar el método anterior.
	public static int numEnteroPrim(int numCompb){
		int sol;
		
		if(primoONo(numCompb) == true){
			sol = 0;
		}
		else{
			sol = numCompb;
		}
		return sol;
	}
	
	//10. Crea un método que dado un carácter, diga si se trata de un número o no.
	public static boolean caracterNum(char letra){
		boolean resp = false;
		
		if(Character.isDigit(letra)){
			resp = true;
		}
		return resp;
	} 
	
	
	//MAIN
	public static void main(String [] args){
		//Creacion de variables
		char letra;
		float num1, num2;
		int opc,num,cuadradoLado	,numeroSigno = 7,numFactorial,numPrim,numCompb;
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		
		//Bucle para que se ejecutarse para probar los metodos hasta que el usuario quiera salirse (Opción 0)
		do{
			System.out.println("\nNumero de metodo que quieras ejecutar: \n0 : Para salir\nPara incrementar el valor de un numero: 2\nSumar dos números decimales, que reciba: 3\nPara borrar la pantalla: 4\nPara escribir un cuadrado de las dimensiones que indiques: 5\nPara decir si un número es positivo, negativo o 0: 6\nPara hacer el factorial de un número: 7\nPara comprobar si un número es primo o no: 8\nRecibir un número y si es primo devolver 0 y si no lo es devolver el número: 9\nRecibir un caracter y decir si es un caracter o un número: 10");
			opc = Integer.parseInt(sc.nextLine()); //"2" -> 2
			
			switch (opc){
				case 0: 					
					salir=true;
					System.out.println("\nAdios, gracias por usar el programa.\nPrograma terminado.");
					break;
				case 1:
					noDevuelveNada();
					break;
				case 2:
					System.out.println("\nDime el numero que quieres incrementar a +1.");
					num = Integer.parseInt(sc.nextLine());
					System.out.println(incrementoNumero(num));
					break;
				case 3:
					System.out.println("\nDime dos numeros con decimales para sumarlos");
					num1 = sc.nextFloat();
					num2 = sc.nextFloat();
					sc.nextLine();
					System.out.println("\nEl resultado es " + sumaDosNumeros(num1,num2));
					break;
				case 4:
					System.out.println("\nHas elegido el metodo de borrar la pantalla.");
					limpiarPantalla();
					break;
				case 5:
					System.out.println("\nDime de que dimensiones quieres el cuadrado.");
					cuadradoLado = Integer.parseInt(sc.nextLine());
					dibujarCuadrado(cuadradoLado);
					break;
				case 6:
					System.out.println("\nDime un número para decirte su signo.");
					numeroSigno = Integer.parseInt(sc.nextLine());
					System.out.println(obtenerSigno(numeroSigno));
					break;
				case 7:
					System.out.print("\nDime un número para hacerle su factorial: ");
					numFactorial = Integer.parseInt(sc.nextLine());
					System.out.printf("\nEl factorial de %d es %d.",numFactorial,factorialNumero(numFactorial));
					break;
				case 8:
					System.out.println("\nDime un numero para decirte si es primo o no.");
					num = Integer.parseInt(sc.nextLine());
					if (primoONo(num) == true){
						System.out.println("\nEs primo.");
					}
					else{
						System.out.println("\nNo es primo");
					}
					break;
				case 9:
					System.out.println("\nDime un numero y si es primo devolvere el número y si no es primo devolvere 0.");
					numCompb = Integer.parseInt(sc.nextLine());
					System.out.println(numEnteroPrim(numCompb));
					break;
				case 10:
					System.out.println("\nDime un caracter o un número y te dire que es lo que has escrito.");
					letra = sc.nextLine().charAt(0);
					if(caracterNum(letra) == true){
						System.out.println("\nLo que has escrito es un número.");
					}
					else{
						System.out.println("\nLo que has escrito es un caracter.");
					}
					break;
					
				default:
					System.out.println("Opcion incorrepta");
			}
			
		}while (!salir);	
	}
}