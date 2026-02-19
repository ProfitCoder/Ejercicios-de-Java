//@Pablo Manuel Fernandez Velazquez 	9:08    19/02/2026

public class Modulo{
	//Atributos
	private final int N_ALUM = 5;
	private String nombre;
	private String curso;
	private String profesor;
	private Alumno[] alumnos;
 	
	//Constructor con argumentos
	public Modulo(String nombre, String curso, String profesor){
		this.nombre = nombre;
		this.curso = curso;
		this.profesor = profesor;
		this.alumnos = new Alumno [N_ALUM];
	}
	
	//Setters y getters
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setCurso(String curso){
		this.curso = curso;
	}
	
	public void setProfesor(String profesor){
		this.profesor = profesor;
	}
	
	public void setAlumnos(Alumno[] alumnos){
		this.alumnos = alumnos;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getCurso(){		
		return curso;
	}
	
	public String getProfesor(){
		return profesor;
	}
	
	public Alumno[]	getAlumnos(){
		return alumnos;
	}
	
	//Metodo para calcular media
	public double calcularMediaTrimestre(int nTrim){
		//Variables
		double media = 0;
		int i;
		boolean evaluado = true;
		
		//Comprobar si estan evaluados los alumnos
		switch (nTrim){
			case 1:
				for(i = 0;i < alumnos.length && evaluado;i++){
					if(alumnos [i].getCal1Trim() != -1){
						media += alumnos[i].getCal1Trim();
					}
					else{
						evaluado = false;
						media = -1;
					}
				}
				break;
			case 2:
				for(i = 0;i < alumnos.length && evaluado;i++){
					if(alumnos [i].getCal2Trim() != -1){
						media += alumnos[i].getCal2Trim();
					}
					else{
						evaluado = false;
						media = -1;
					}
				}
				break;
			case 3:
				for(i = 0;i < alumnos.length && evaluado;i++){
					if(alumnos [i].getCal3Trim() != -1){
						media += alumnos[i].getCal3Trim();
					}
					else{
						evaluado = false;
						media = -1;
					}
				}
				break;
		}
		if(media != -1){
			media = media/N_ALUM;
		}
		return media;
	}
	
	//Metodo informe curso
	public void informeCurso(){
		for(int i = 0; i < alumnos.length;i++){
			alumnos[i].informeAlumno();
		}
	}
}