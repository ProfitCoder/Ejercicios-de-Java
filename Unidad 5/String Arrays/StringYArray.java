import java.util.Arrays;

public class StringYArray{
	//Atributos
	
	//Metodos
	public static String cadenasConcat(String cad1,String cad2){
		return cad1.concat(cad2);
	}
	
	public static char [] stringArray(String cad1){
		char [] arrayString = new char [cad1.length()];
		
		for(int i = 0;i < cad1.length();i++){
			arrayString[i] = cad1.charAt(i);
		}                     
		return arrayString;
	}
	
	public static String convierteArrayEnString(char [] arrayACadena){
		String cadSalida = "";
		
		for(int  i = 0;i < arrayACadena.length;i++){
			cadSalida += arrayACadena[i];
		}
		return cadSalida;
	}
}