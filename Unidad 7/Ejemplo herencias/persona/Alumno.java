//@ProfitCoder 		9:24   05/03/2026

package persona;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Alumno extends Persona implements Imprimible{
	//Atributos
	private String grupo;
	private double notaMedia;
	
	//Constructores
	public Alumno (String nombre, String apellidos, GregorianCalendar fechaNac, String grupo, double notaMedia){
		super(nombre,apellidos,fechaNac);		//Sirve para llamar al constructor de la clase padre
		this.grupo = grupo;
		this.notaMedia = notaMedia;
	}
	
	//Otros Metodos
	public void setGrupo(String grupo){
		this.grupo = grupo;
	}
	
	public void setNotaMedia(double notaMedia){
		this.notaMedia = notaMedia;
	}
	
	public String getGrupo(){
		return grupo;
	}
	
	public double getNotaMedia(){
		return notaMedia;
	}
	
	
	//Usamos Override porque hemos sobreescrito el metodo de la clase padre
	@Override
	public String getNombre(){
		return "Alumno: " + nombre;
	}
	
	//Metodo mostrar
	@Override
	public void mostrar(){
		super.mostrar();
		System.out.println("Grupo: " + grupo);
		System.out.println("Nota Media: " + notaMedia);
	}
	
	@Override
	public void mostrarInfoEspecifica(){
		System.out.println("\nGrupo: " + grupo);
		System.out.println("Nota media: " + notaMedia);
	}
	
	
	//Metodo sobreescrito de la interfaz
	@Override
	public String devolverContenidoString(){
		return super.devolverContenidoString() + String.format("{Grupo = %s, Nota Media = %.2f}", grupo, notaMedia);
	}
	
	public String pruebaPolimorfismo(){
		return "Estamos probando polimorfismo";
	}
}