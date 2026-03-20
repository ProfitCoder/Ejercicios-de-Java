//ProfitCoder    9:47       19/03/2026

package polimorfismotest;

import persona.*;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class PolimorfismoTest{
	public static void main(String [] args){
		//Declaramos un objeto de persona
		Persona p1 = null;
		
		//Declaración de variables
		Scanner sc = new Scanner (System.in);
		String nombre,apellidos,fecha,grupo,especialidad;
		int tipo;
		double salario, notaMedia;
		GregorianCalendar fechaNac;
		
		//Pedir valores
		System.out.print("\nNombre: ");
		nombre = sc.nextLine();
		
		System.out.print("\nApellidos: ");
		apellidos = sc.nextLine();
		
		System.out.print("\nFecha de nacimiento (DD-MM-YYYY): ");
		fecha = sc.nextLine();
		
		//Preguntar si es un alumno o un profesor
		System.out.print("\nAlumno (1)Profesor (2): ");
		tipo = Integer.parseInt(sc.nextLine());
		
		fechaNac = new GregorianCalendar(
		Integer.parseInt(fecha.substring(6)),
		Integer.parseInt(fecha.substring(3,5)),
		Integer.parseInt(fecha.substring(0,2)));
		
		//Pedir los valores específicos para alumno y profesor
		if(tipo == 1){    //Alumno
			System.out.print("\nGrupo: ");
			grupo = sc.nextLine();
			
			System.out.print("\nNota Media: ");
			notaMedia = Double.parseDouble(sc.nextLine());
			
			p1 = new Alumno(nombre,apellidos,fechaNac,grupo,notaMedia);
			
			//Probar metodo pruebaPolimosrfismo
			System.out.println(((Alumno)p1).pruebaPolimorfismo());		//Si no se hace este casting de alumno, no encuentra p1 en la clase
		}
		else if(tipo == 2){   //Profesor
			System.out.print("\nEspecialidad: ");
			especialidad = sc.nextLine();
			
			System.out.print("\nSalario: ");
			salario = Double.parseDouble(sc.nextLine());
			
			p1 = new Profesor(nombre,apellidos,fechaNac,salario,especialidad);
		}
		else{
			System.out.println("Opción incorrecta");
		}
		
		//Devolver los datos aprovechandose del uso del polimorfismo
		System.out.println("\n\n**DATOS**");
		System.out.println(p1.devolverContenidoString());
				
	}
}