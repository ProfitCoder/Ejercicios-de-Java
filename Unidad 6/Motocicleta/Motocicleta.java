public class Motocicleta{
	//Atributos
	private int caballosPT;
	private int velocidadPunt;
	private String Matricula;
	
	//Constructor sin atributos
	public Motocicleta(){
		
	}
	
	public Motocicleta(int caballosPT,int velocidadPunt,int numMatr,String letMatr){
		this.caballosPT = caballosPT;
		this.velocidadPunt = velocidadPunt;
		this.Matricula = Matricula;
	}
	
	private static boolean validarMatricula(String Matricula){
		boolean esValida = false;
		Matricula = Matricula.toUpperCase().trim();
		
		//Pattern y matcher
		Pattern p = Pattern.compile("[0-9]{4}[A-Z]{3}")
		Matcher m = p.matcher(Matricula);
		if(m.matches()){
			esValida = true;
		}
		
		return esValida;
	}
	
	//toString
	public String toString(){
		return String.format("\nCV: %d\nKM/H: %d\nMatricula: %s",caballosPT,velocidadPunt,Matricula);
	}
	
	//setts y getts
	public void setCaballosPT(int caballosPT){
		this.caballosPT = caballosPT;
	}
	
	public void setVelocidadPunt(int velocidadPunt){
		this.velocidadPunt = velocidadPunt;
	}
	
	public void setMatricula(int Matricula) throws exception {
		if (validarMatricula(Matricula)){
			this.Matricula = Matricula;
		}
		else{
			Exception e = new Exception("Matricula Imncorrecta");
			throw e;
		}
	}	
	
	public int getCaballosPT(){
		return this.caballosPT;
	}
	
	public int getVelocidadPunt(){
		return this.velocidadPunt;
	}
	
	public int getMatricula(){
		return this.Matricula;
	}
	
	//Metodo Mostrar matricula
	public mostrarMatricula(String Matricula){
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}