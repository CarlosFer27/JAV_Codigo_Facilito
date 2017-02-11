package Calculadora;

public class Operaciones {
	
	public int Suma(int num1, int num2){
		int suma = num1 + num2;
		return suma;
	}
	
	public int Resta(int num1, int num2){
		int resta = num1 - num2;
		return resta;
	}
	
	public int Multiplicacion(int num1, int num2){
		int multi= num1*num2;
		return multi;
	}
	
	public int Division(int num1, int num2) throws ArithmeticException{
		int division=0;
		try {
			division = num1/num2;
			
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		return division;
	}

}
