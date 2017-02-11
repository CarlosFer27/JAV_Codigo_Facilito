package Calculadora;
import java.util.Scanner;

public class PedirDatos {
	int num1;
	int num2;
	Scanner leer = new Scanner(System.in);
	
	public void setNum1(int num1){
		this.num1=num1;
	}
	
	public int getNum1(){
		return num1;
	}
	
	public void setNum2(int num2){
		this.num2=num2;
	}
	
	public int getNum2(){
		return num2;
	}
	
	public void PedirNumeros(){
		System.out.println("Ingresa un numero:");
		setNum1(leer.nextInt());
		System.out.println("Ingresa un numero: ");
		setNum2(leer.nextInt());
	}
}
