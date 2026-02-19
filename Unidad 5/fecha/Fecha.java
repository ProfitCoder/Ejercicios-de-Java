package fecha;

public class Fecha{
	//Atributos
	private int dia,year;
	private EnumMes mes;
	
	//Constructores
	public Fecha(EnumMes mes){
		this.mes = mes;
	}
	
	public Fecha(int dia,EnumMes mes,int year){
		this.dia=dia;
		this.mes=mes; 
		this.year=year;
	}
	
	//Getters y Setters
	public int getDia(){
		return dia;
	}
	
	public EnumMes getMes(){
		return mes;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setDia(int dia){
		this.dia = dia;
	}
	
	public void setMes(EnumMes mes){
		this.mes = mes;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	//Metodo isSummer()
	public boolean isSummer(){
		boolean esVerano=false;
		
		if(mes == EnumMes.Jul || mes == EnumMes.Ago){
			esVerano = true;
		}
		else 
			if(dia >= 21 && mes == EnumMes.Jun){
			esVerano = true;
			}
			else 
				if(dia <= 22 && mes == EnumMes.Sep){
				esVerano = true;
				}
		return esVerano;
	}
	
	//Metodo diferenciasEnYears
	public int diferenciaYear(Fecha fechaActual){
		int aDiferencia = fechaActual.year - year;
		
		//Si el mes es posterior al de la fecha actual resto 1
		if(mes.ordinal() > fechaActual.mes.ordinal())
		{
			aDiferencia -= 1;
		}
		else
			if(mes == fechaActual.mes && dia > fechaActual.dia){
				aDiferencia -= 1;
			}
		return aDiferencia;
	}
	
	//toString
	public String toSting(){
		return String.format("%d de %s del %d",dia,mes,year);
	}
}