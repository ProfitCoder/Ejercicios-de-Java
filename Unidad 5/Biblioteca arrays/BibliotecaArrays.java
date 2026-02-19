import java.util.Arrays;
import java.util.Scanner;

public class BibliotecaArrays{
	//Atributos
	
	//Metodos
	//1. Genera un array de tamaño n con números aletorios cuyo intervalo (mínimo y máximo) se indica como parametro.
	public static int [] generaArrayInt(int n,int min,int max){
		int [] array = new int [n];
		
		for(int i = 0;i < array.length;i++){
			array [i] = (int)(Math.random() * (max - min + 1) + min);
		}
		return array;
	}
	
	//2. Devuelve el mínimo del array que se pasa como parámetro.
	public static int minimoArray(int [] array){
        int minimo = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] < minimo){
                minimo = array[i];
            }
        }
        return minimo;
    }

    // 3. Devuelve el máximo del array
    public static int maximoArray(int [] array){
        int maximo = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > maximo){
                maximo = array[i];
            }
        }
        return maximo;
    }

    // 4. Devuelve la media del array
    public static double mediaArray(int [] array) {
        int suma = 0,media;

        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
		media = suma/array.length;
        return (double)media;
    }
}