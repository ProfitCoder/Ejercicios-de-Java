public class Animal{
	//Atributos (public que puedes usar los atributos fuera de la clase tambien, y con private solo se pueden usar en la clase)
	private String nombre,raza;
	private short edad;
	
	//Metodos
	//Gets
	public String getNombre(){			
		return nombre;
	}
	
	public String getRaza(){
		return raza;
	}
	
	public short getEdad(){
		return edad;
	}
	
	//Sets
	public void setNombre(String nuevoNombre){
		nombre = nuevoNombre;
	}
	
	public void setRaza(String nuevaRaza){
		raza = nuevaRaza;
	}
	
	public void setEdad(short nuevaEdad){
		edad = nuevaEdad;
	}
}