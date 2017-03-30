package operaciones;
import java.util.Scanner;

public class PedirDatos {
	Scanner leer = new Scanner(System.in);
	int num1;
	int num2;
	int resultado;
	int otraOperacion;
	
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
	
	public void setResultado(int resultado){
		this.resultado=resultado;
	}
	
	public int getResultado(){
		return resultado;
	}
	

	public void pedirDatos(){
		System.out.println("Ingrese un numero: ");
		setNum1(leer.nextInt());
		
		System.out.println("Ingresa un otro numero:");
		setNum2(leer.nextInt());
	}
	
}
