public class Animal{
	//Atributos (public que puedes usar los atributos fuera de la clase tambien, y con private solo se pueden usar en la clase)
	private String nombre,raza;
	private short edad;
	
	//Metodos
	//Constructores (Son metodos que me permiten inicializar valores de los atributos)
	public Animal(){
		
	}
	
	public Animal(String nombre, String raza, short edad){
		this.nombre = nombre;					//El this. sirve para diferenciar cuando se llama igual el parametro y el atributo
		this.raza = raza; 
		this.edad = edad;
	}
	
	//Metodo MAIN (Metodo que es necesario para poder ejecutar el programa)
	public static void main(String [] args){
		//Crear un animal y mostramos sus atributos
		Animal perro = new Animal();
		
		System.out.println(perro);     //Esto es lo mismo que System.out.print(perro.toString); solo que java lo simplifica
		
		//Le ponemos nombre al animal
		perro.setNombre("Coco");
		//Asigno una raza
		perro.setRaza("Pastor Aleman");
		//Asignar edad
		perro.setEdad((short)11);
		
		//Cumplir años
		perro.cumpleAnios();
		
		System.out.println(perro);
		
		Animal gato = new Animal("Nube","Golden Retriever",(short)4);
		System.out.println(gato);
		
		
	}
	
	
	
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
	
	//ToString 
	public String toString(){
		String cadena = String.format("\nNombre: %s\nRaza: %s\nEdad: %d",nombre,raza,edad);
		return cadena;
	}
	
	//Cumpleaños
	public int cumpleAnios(){
		edad++;
		return edad;
	}
}