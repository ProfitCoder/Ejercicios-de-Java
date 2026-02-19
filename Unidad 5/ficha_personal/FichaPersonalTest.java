package ficha_personal;

import fecha.*;
import java.util.Scanner;

public class FichaPersonalTest{
	public static void main(String [] args){
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String nombre,fecha;
		Pattern pFecha = Pattern.compile("(3[01]|[21][0-9]|0[1-9])[/](1[0-2]|0[1-9])[/][\\d]{4})");
		Matcher mFecha;
		boolean fCorrecta=false;
		
		//Pedimos los valores al usuariohasta que la fecha sea correcta
		do{
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Fecha de nacimiento (dd/mm/aaaa)");
			fecha = sc.nextLine().trim();
			
			//Compromas si la fecha cumple el formato
			mFecha = PFecha.matcher(fecha);
			if(mFecha.matches()){
				fCorrecta = true;
				//Obtener dia, mes y anio del String fechat
				dia = Integer.parseInt(fecha.substring(0,2));
				mes = Integer.parseInt(fecha.substring(3,5));		//En substring es el ultimo valor el que no coje
				year = Integer.parseInt(fecha.substring(6));		//Si solo le indicas 1 numero le dices desde que posicion empieza a leer
				
				EnumMes eMes = EnumMes.values()[mes - 1];		//Devuelve un array con y entre parentesis ponemos la posicion que queremos del array
				
				//Creo la fecha de nacimiento
				Fecha fechaNac = new Fecha(dia,eMes,year);
				
				//Crear el objeto FichaPersonal
				FichaPersonal ficha1 = new FichaPersonal(nombre,fechaNac);
				System.out.println("Ficha creada");
				System.out.println(ficha1);	
			}
			else{
				System.out.println("Formato de fecha incorrecto");
			}
		}while (!fCorrecta);
	}
	
}