package com.prog04.principal;

import com.prog04.figuras.Rectangulo;

public class Principal{
	public static void main(String [] args){
		//Variables y objetos
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(2.0,4.5);
		
		//Probar Metodos
		System.out.println("\nBase: " + r1.getBase() +"\nAltura : " + r1.getAltura());
		System.out.println("\nBase: " + r2.getBase() +"\nAltura : " + r2.getAltura());
		
		//Modificar
		r1.setBase(5);
		System.out.println("\nBase: " + r1.getBase() +"\nAltura : " + r1.getAltura());
		
		System.out.println("\nArea :" + r2.getArea());
		
		r1.setAltura(5);
		System.out.println("\nEs cuadrado :" + r1.isCuadrado());
		
		System.out.println("\n"+r1);
		System.out.println("\n"+r2);
	}
}