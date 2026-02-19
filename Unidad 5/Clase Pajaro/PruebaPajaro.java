public class PruebaPajaro{
	public static void main(String [] args){
		Pajaro pajaro1 = new Pajaro();
		
		//Mostrar el pajaro por pantalla
		System.out.println(pajaro1);
		
		//Creacion del 2 pajaro
		Pajaro pajaro2 = new Pajaro("Periquito",10,5);

		//Mostrar por pantalla
		System.out.println(pajaro2);
		
		//Hacer que los pajaros vuelen y mostramos la distancia
		System.out.printf("\nEl pajaro 1 voló una distancia de: %.2f metros.",pajaro1.volar(5,5));
		System.out.printf("\nEl pajaro 2 voló una distancia total de %.2f metros.\n",pajaro2.volar(-4,-7));
		
		//Modificar nombre de pajaro 1
		pajaro1.nombre = "Perico";
		System.out.println(pajaro1);
		
		//Para poder mostrar el nombre del pajaro (Para ello se usan el set y el get)
		System.out.println(pajaro1.getNombre());
		
		//Ahora consultamos el numero total de pajaros
		System.out.println(Pajaro.getnumObjetosPajaro());
	}
}