//@ProfitCoder 		9:24   05/03/2026

package persona;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Profesor extends Persona implements Imprimible{
	//Atributos
	double salario;
	String especialidad;
	
	//Constructores
	public Profesor(String nombre, String apellidos, GregorianCalendar fechaNac, double salario, String especialidad){
		//Tambien se puede hacer asi porque hereda los atributos de persona
		super(nombre,apellidos,fechaNac);
		this.salario = salario;
		this.especialidad = especialidad;
	}
	
	//Metodos
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public void setEspecialidad(String especialidad){
		this.especialidad = especialidad;
	}
	
	public double getSalario(){
		return salario;
	}
	
	public String getEspecialidad(){
		return especialidad;
	}
	
	//Usamos Override porque hemos sobreescrito el metodo de la clase padre
	@Override
	public String getNombre(){
		return "Profesor" + super.getNombre();
	}
	
	//El super se usa para llamar a un atributo o metodo de la clase padre
	
	
	//Metodo mostrar
	@Override
	public void mostrar(){
		super.mostrar();
		System.out.println("Salario: " + salario);
		System.out.println("Especialidad: " + especialidad);
	}
	
	@Override
	public void mostrarInfoEspecifica(){
		System.out.println("\nSalario: " + salario);
		System.out.println("Especialidad: " + especialidad);
	}
	
	//Metodo sobreescrito de la interfaz
	@Override
	public String devolverContenidoString(){
		return super.devolverContenidoString() + String.format("{Salario = %.2f, Especialidad = %s}", salario, especialidad);
	}
}