public class Pajaro{
	//Creacion de atributos
	private String nombre;
	private int posX,posY;
	
	//Atributos estaticos
	private static int numObjetosPajaro = 0;
	
	//Metodos
	//Constructores
	public Pajaro(){
		numObjetosPajaro ++;
	}
	
	public Pajaro(String nombre,int posX, int posY){
		this.nombre = nombre;
		this.posX = posX;
		this.posY = posY;
		numObjetosPajaro ++;
	}
	
	//Metodo static para consultar el numero de pajaros creados 
	public static int getnumObjetosPajaro(){
		return numObjetosPajaro;
	}
	
	//Metodo volar
	public double volar(int posX, int posY){
		double d = Math.sqrt(Math.pow((posX-this.posX),2)+Math.pow((posY-this.posY),2));
		return d; 
	}
	
	//toString
	public String toString(){
		String cad = String.format("\nNombre: %s\nposX: %d\nposY: %d",nombre,posX,posY);
		return cad;
	}
	
	//Metodo MAIN
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
	}
	
	//Metodo para consultar los atributos desde fuera de esta clase
	//Gets
	public String getNombre(){
		return nombre;
	}
	
	public int getPosX(){
		return posX;
	}
	
	public int getPosY(){
		return posY;
	}
	
	//Sets
	public void setNombre(){
		
	}
	
	public void setRaza(){
		
	}
	
	public void setEdad(){
		
	}
}