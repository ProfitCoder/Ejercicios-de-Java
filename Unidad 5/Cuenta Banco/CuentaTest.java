import java.util.Scanner;

public class CuentaTest{
	//Atributos
	private int numeroCuenta;
	private double saldo;
	
	//Metodos
	public CuentaTest(int numeroCuenta,double saldo){
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	//1. Metodo para ingreso
	public static double ingresoDinero(double ing,double saldo1){
		saldo1 += ing;
		
		return saldo1;
	}
	
	//2. Metodo para retirar dinero
	public static double retirarDinero(double ret,double saldo1){
		double saldof = 0;
		
		saldof = (saldo1 - ret);
		
		return saldof;
	}
	
	//3. Metodo para transderencias
	public static double transferenciaEntreBancos(double trans,double saldo1,double saldo2,int opc){
		switch (opc){
			case 1:
				saldo1 -= trans;
				saldo2 += trans;
				break;
			case 2:
				saldo2 -= trans;
				saldo1 += trans;
				break;
				
			default:
				System.out.println("Opcion incorrecta");
		}
		return saldo1;
	}
	
	//Metodo toString 
	public String toString(){
		String cadena = String.format("\nNúmero de cuenta: %d\nSaldo disponible: %.2f",numeroCuenta,saldo);
		return cadena;
	}
	
	//Metodo MAIN
	public static void main(String [] args){
		//Variables
		int opcM = 0,opc = 0;
		double ing = 0,ret = 0,trans = 0,saldo1 = 67523.68,saldo2 = 954264.29;
		Scanner sc = new Scanner(System.in);
		
		//Creacion de cuentas
		//Cuenta nº1
		System.out.print("Cuenta Nº1: ");
		CuentaTest cuenta1 = new CuentaTest(27482909,67523.68);
		System.out.println(cuenta1);
		
		//Cuenta nº2
		System.out.print("\nCuenta Nº2: ");
		CuentaTest cuenta2 = new CuentaTest(72957889,954264.29);
		System.out.println(cuenta2);
		
		//Elección de que metodo ejecutar.
		System.out.print("\n¿Que metodo quieres ejecutar?\n1. Ingreso en la cuenta 1.\n2. Retiro de la cuenta 1.\n3. Trasferencia de la cuenta 1 a la 2 o de la 2 a la 1.\n\nSu selección: ");
		opcM = Integer.parseInt(sc.nextLine());
		
		//Resolución usando un switch
		switch (opcM){
			case 1:
				System.out.println("\nHas elegido el metodo de ingreso, porfavor introduzca la cantidad que quiere ingresar a su cuenta n1.");
				System.out.print("Cantidad a ingresar: ");
				ing = sc.nextDouble();
				saldo1 = 67523.68;	
				
				System.out.print("\nEl saldo final de la cuenta Nº1 es: ");
				System.out.println(ingresoDinero(ing,saldo1));
				break;
			case 2:
				System.out.println("\nHas elegido el metodo de retiro, porfavor introduzca la cantidad que quiere retirar de su cuenta n1.");
				System.out.println("Cantidad a retirar: ");
				ret = sc.nextDouble();
				saldo1 = 67523.68;	
				
				System.out.print("\nEl saldo final de la cuenta Nº1 es: ");
				System.out.println(retirarDinero(ret,saldo1));
				break;
			case 3:
				System.out.println("\nSi quieres hacer la transferencia de la cuenta 1 a la 2, pulsa 1.\nSi quieres hacer la transferencia de la cuenta 2 a la 1, pulsa 2.");
				opc = Integer.parseInt(sc.nextLine());
				System.out.print("\nCuanto dinero quieres transferir: ");
				trans = sc.nextDouble();
				saldo1 = 67523.68;
				saldo2 = 954264.29;
				
				System.out.println("\nEl saldo que ha quedado en la cuenta Nº1 es: ");
				System.out.println(transferenciaEntreBancos(trans,saldo1,saldo2,opc));
				
				if (opc == 1){
					double calculo = saldo2 + trans;
					System.out.printf("\nEl saldo de su cuenta Nº2 es ahora de: %.2f",calculo);
					System.out.println();
				}
				else{
					double calculo = saldo2 - trans;
					System.out.printf("\nEl saldo de su cuenta Nº2 es ahora de: %.2f",calculo);
					System.out.println();
				}
				break;
				
			default:
				System.out.println("\nOpción incorrecta.");
		}
	}
}