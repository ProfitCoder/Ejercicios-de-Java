public class TestListaLibros{
	public static void main(String [] args){
		//Crear lista de libros
		ListaLibros lista1 = new ListaLibros();
		
		//Numeros de libros actuales en la lista
		System.out.println("\nHay en total " + lista1.getNumLibros() + " libros creados en lista 1.");
		
		//Crear tres libros
		Libro lib1 = new Libro("El Quijote","Cervantes","644-1549-87854-0000","Planeta",30.00);
		Libro lib2 = new Libro("El Bosque","Saramago","548-7694-89486-5341","Planeta",45.90);
		Libro lib3 = new Libro("Java para principiantes","Anónimo","146-9962-785444-11111","Planeta",12.40);
		
		System.out.println(lista1);
		
		//Añadir los libros
		if(lista1.insertarLibro(libro1)){
			System.out.pritln("Libro Insertado");
		}
		else
			System.out.prinln("Libro no encontrado");
		
		System.out.println(lista1);
	
	}
}