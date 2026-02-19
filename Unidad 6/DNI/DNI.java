//@Pablo Manuel Fernández Velázquez  		10:05  16/02/2026

import java.util.regex.*;

public class DNI{
	//Atributos
	private int numDNI;
	
	//Metodos
	public int obtenerDNI(){
		return numDNI;
	}
	
	public String obtenerNIF(){
		return numDNI + character.toString(CalcularLetraNIF(numDNI));
	}
	
	public void establecer(String nif) throws Exception{
		if(validarNIF){
			this.numDNI = extraerNumeroNIF(nif);
		}
		else{
			throws new Exception("Formato de nif inválido");
		}
	}
	
	public void establecer(int dni) throws Exception{
		if(dni > 0 && dni <= 99999999)
			numDNI = dni
		else{
			System.out.println("Dni incorrecto");
		}
	}
	
	public static char calcularLetraNIF(int dni){
		String letras="TRWAGMYFPDXBNJZQVHLCKE";
		int resto = dni % 23;
		return letras.charAt(resto);
	}
	
	public boolean validarNIF(String nif){
		boolean EsCorrecto = false;
		
		Pattern p = Pattern.compile("[0-9]{8}[A-Z]");
		Matcher m = p.matcher(nif);
		
		if(m.matches()){
			if(calcularLetraNIF(extraerNumeroNIF(nif)) == extraerLetraNIF(nif)){
				
				EsCorrecto = true;
			}
		}
		
		return EsCorrecto;
	}
	
	private static char extraerLetraNIF(String nif){
		return nif.charAt(nif.length()-1);
	}
	
	private stataic int extraerNumeroNIF(String nif){
		return Integer parseInt(nif.substring(0,nif.length()-1));
	}
	
	//toString
	public String toString(){
		return "El dni es : " + numDNI;
	}
}