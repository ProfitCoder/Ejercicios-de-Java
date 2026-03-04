//@ProfitCoder 			12:01			25/02/2026

import java.util.Arrays;

public class ListaLibros{
	//Atributos
	private final int TAM_LISTA = 3;
	private Libro[] lista;
	private int numLibros;
	
	//Constructor
	public ListaLibros(){
		lista = new Libro[TAM_LISTA];
	}
	
	//Metodo para mostrar por pantalla el número de libros creados
	public int getNumLibros(){
		return numLibros;
	}
	
	//Insertar un libro
	public boolean insertarLibro(){
		boolean insertado = false;
		
		//Puedo insertar mientras la lista no esta llena
		if(numLibros < TAM_LISTA){
			lista[numLibros] = libro;
			numLibros++;
			insertado = true;
			Arrays.sort(lista,0,numLibros);
		}
		return insertado;
	}
	
	//Ver libros que tengo en la lista
	public String toString(){
		String salida = "";
		for(int i = 0;i < lista.length;i++){
			salida += lista[i] + "\n******************\n";
		}
		return salida;
	}
	
	//Eliminar libro de posicion
	public boolean eliminarLibro(int posicion){
		boolean eliminado = false;
		
		if(lista[posicion] != null && posicion < TAM_LISTA){
			for(int i = poscion;i < lista.length - 1;i++){
				lista [i] = lista [i + 1];
			lista[i] = null;	
			numLibros--;
			eliminado = true;
			}
		}
		return eliminado; 
	}
}