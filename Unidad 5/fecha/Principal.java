package fecha;

public class Principal{
	public static void main(String [] args){
	//Instancia un objeto de la clase Fecha denominado objFecha
	Fecha objFecha1 = new Fecha(EnumMes.Feb);
	System.out.println("Primera fecha, inicializada con el primer constructor");
	//Actualiza los atributos dia y año para dicho objeto
	objFecha1.setDia(20);
	objFecha1.setYear(2000);
	//Muestra la fecha por pantalla en formato largo
	System.out.println(objFecha1);
	//Muestra un mensaje por pantalla indicando si la fecha es verano
	System.out.println(objFecha1.isSummer()?"Es verano" : "No es verano");
	//Muestra la diferencia en años respecto a la fecha actual
	Fecha fechaActual = new Fecha(6,EnumMes.Feb,2006);
	System.out.printf("Hay %d años de diferencia respecto a %s\n",objFecha1.diferenciaYear(fechaActual));
	//Instancia otro objeto de la clase Fecha denominado objFercha2 con el segundo 	
	Fecha objFercha2 = new Fecha(23,EnumMes.Sep,2025);
	}
}