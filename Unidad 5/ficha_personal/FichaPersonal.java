package ficha_personal;

import fecha.*;

public class FichaPersonal{
	//Atributos
	private String nombre;
	private Fecha fNac;
	private int edad;
	
	//Constructor 
	public FichaPersonal(String nombre, Fecha fNac){
		this.nombre = nombre;
		this.fNac = fNac;
		this.edad = fNac.diferenciasYear(new Fecha(9,EnumMes.Ene,2000));
	}
	
	//toString
	public String toString(){
		return String.format("\nDia: %d\nMes: %s\nAño: %d",nombre,fNac,edad); 
	}
}