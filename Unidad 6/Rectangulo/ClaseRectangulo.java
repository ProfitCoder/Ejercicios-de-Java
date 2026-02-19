public class Rectangulo{
	//Atributos
	private double x1, y1; //vertice inferior
	private double x2, y2; //vertice superior derecho
	
	//Constructor sin parametros
	public Rectangulo(){
		
	}
	
	//Constructor con parametros
	public Resctangulo(double x1 ,double x2 ,double y1 ,double y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	//toString
	public String toString(){
		return String.format("\nRectangulo (%.2f,%.2f)-(%.2f,%.2f)",x1,y1,x2,y2);
	}
	
	public static void main(String [] args){
		//Creación de rectangulos
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(3,6,7,2);
		
		//Mostrarlos por pantalla
		System.out.println(r1);
		System.out.println(r1);
	}
	
}