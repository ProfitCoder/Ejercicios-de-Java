package com.prog04.figuras;

public class Rectangulo{
	//Atributos
	private double base;
	private double altura;
	
	//Constructor sin parametros
	public Rectangulo(){}
	
	//Constructor con parametros
	public Rectangulo(double base,double altura){
		this.base = base;
		this.altura = altura;
	}
	
	//Setts y Getts
	public double getBase(){
		return base;
	}
	
	public double getAltura(){
		return altura;
	}
	
	public void setBase(double base){
		this.base = base;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	//Area
	public double getArea(){
		return base * altura;
	}
	
	//toString
	public String toString(){
		return String.format("Base: %.2f\nAltura: %.2f",base,altura);
	}
	
	//Booleano indicando si el rectangulo es cuadrado
	public boolean isCuadrado(){
		return base == altura;		//Devuelve un booleano
	}
}