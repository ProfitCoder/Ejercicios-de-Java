public class ModuloTest{
	public static void main(String [] args){
		//a) Creacion de 5 alumnos
		Alumno al1 = new Alumno();
		al1.setNombre("Vicente");
		al1.setDNI("12345678Z");
		al1.setCal1Trim(10);
		al1.setCal2Trim(10);
		al1.setCal3Trim(10);
		//al1.informeAlumno();
		
		Alumno al2 = new Alumno("Maria","2313456");
		al2.setCal1Trim(10);
		al2.setCal2Trim(4.9);
		al2.informeAlumno();
		
		Alumno al3 = new Alumno("Pedro","11111111A",9,5.4,3);
		//al3.informeAlumno();
		
		Alumno al4 = new Alumno("Ana","6165454565B",10,9.4,8.3);
		//al4.informeAlumno();
		
		Alumno al5 = new Alumno("Antonio","123532231G",5,4.2,1.5);
		//al5.informeAlumno();
		
		//b) Creacion Modulo
		Modulo mod1 = new Modulo("Programación","1DAW-BIL","Manuel");
		Alumno[] arrayAlumnos = {al1,al2,al3,al4,al5};
		mod1.setAlumnos(arrayAlumnos);
		//System.out.println("Media 1 Trim: " + mod1.calcularMediaTrimestre(1));
		System.out.println("---------------------------------------------------");
		
		//c) Calcular media de los tres trimestres de este modulo
		System.out.println("Media 1 Trim: " + mod1.calcularMediaTrimestre(1));
		System.out.println("Media 2 Trim: " + mod1.calcularMediaTrimestre(2));
		System.out.println("Media 3 Trim: " + mod1.calcularMediaTrimestre(3));
		
		//d) Informe final (Mostrando informacion de todos los alumnos)
		//mod1.informeCurso();
	}
}