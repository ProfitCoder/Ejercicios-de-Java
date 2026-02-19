public class PruebaBibliotecaArrays{
	public static void main(String [] args){
		//Creacion de variables

		int n,min,max,iniciar;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nBienvenido a la biblioteca de Arrays.\nA continuación indica los parametros que se piden para generar el Array.\nTamaño del Array:");
		n = Integer.parseInt(sc.nextLine());
		System.out.println("\nAhora dame el valor maximo de número que quieres en el array:");
		max = Integer.parseInt(sc.nextLine());
		System.out.println("\nAhora el valor minimo del Array:");
		min = Integer.parseInt(sc.nextLine());
		System.out.println("\nArray generado: " + generaArrayInt(n,min,max));
	}
	
	//Metodo Ejecutar Ejercicio.
	public static void EjecutarEjercicio(int iniciar){
		
	}
}