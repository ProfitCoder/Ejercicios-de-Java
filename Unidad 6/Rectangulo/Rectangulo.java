//@Pablo Manuel Fernandez Velazquez		9:17 16/02/2026

//Si no importamos un paquete java toma como paquete la carpeta en la que se encuentra esta clase

//Dejamos solo el class para que solo se pueda acceder a la clase desde el Paquete
class Rectangulo{
	//Atributos
	private double x1, y1; //vertice inferior
	private double x2, y2; //vertice superior derecho
	private static int numRectangulos = 0; //Sirve para guardar la cantidad de Rectangulos creados
	private String nombre; //Sirve para poner nombre a los rectangulos creados
	private static String nombreFigura = "Rectangulo"; //Guarda el nombre de la clase
	private static final double PI = 3.141594; //Guarda el valor del número PI
	
	//Constructor sin parametros
	public Rectangulo(){
		numRectangulos++;
	}
	
	//Constructor con parametros
	public Rectangulo(String nombre, double x1 ,double x2 ,double y1 ,double y2){
		this.nombre = nombre;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		numRectangulos++;
	}
	
	//toString
	public String toString(){
		return String.format("\nNombre: %s\nRectangulo (%.2f,%.2f)-(%.2f,%.2f)",nombre,x1,y1,x2,y2);
	}
	
	//Setts y getts 
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;         //Poner this o no aqui da igual
	}
	
	public double calcularSuperficie(){
		double base = Math.abs(x2-x1);						//Math.abs sirve para poner los valores en valor absolute
		double altura = Math.abs(y2-y1);
		
		return base*altura;
	}
	
	public double calcularPerimetro(){
		double base = Math.abs(x2-x1);						//Math.abs sirve para poner los valores en valor absolute
		double altura = Math.abs(y2-y1);
		
		return (a+b)*2;
	}
	
	public desplazarRectangulo(double desplazarX, double desplazarY){
		x1 += desplazarX;
		x2 += desplazarX;
		
		y1 += desplazarY;
		y2 += desplazarY;
	}
	
	
	
	
	
	public static void main(String [] args){
		//Creación de rectangulos
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo("Primero",3.0,6.5,7.7,2.9);
		
		//Mostrarlos por pantalla
		System.out.println(r1);
		System.out.println(r2);
		
		//Modificacion nombre 1 rectangulo
		r1.setNombre("Modificado");
		System.out.println("\nNombre de r1 nuevo: " + r1.getNombre());
		
		//Numero total de REctangulos creados
		System.out.println("\nEl número total de rectangulos es de " + numRectangulos);
		
		//Nombre de la Figura
		System.out.println("\nEstamos creando " + nombreFigura + "s");
		
		//Valor de PI
		System.out.println("\nEl valor de PI es " + PI);
		
		//Calculo de superficie
		System.out.println("\nLa superficie del Rectangulo 1 es: " + r1.calcularSuperficie());
	
		System.out.println("\nLa superficie del Rectangulo 2 es: " + r2.calcularSuperficie());
	}
	
}