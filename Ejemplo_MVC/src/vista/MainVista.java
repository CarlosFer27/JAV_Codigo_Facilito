package vista;
import controlador.ControladorOperaciones;
import java.util.Scanner;


public class MainVista {
	
	public static void main(String[] args){
		ControladorOperaciones instControlador = new ControladorOperaciones();
		Scanner leer = new Scanner(System.in);
		System.out.println("Elige la opcion que requieras: ");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicacion");
		System.out.println("4) Division");
		
		int opcion=leer.nextInt();
		int num1, num2;
		
		switch(opcion){
		
		case 1 : 
			System.out.println("Ingresa el primer numero: ");
			num1=leer.nextInt();
			System.out.println("Ingresa el sedundo numero: ");
			num2=leer.nextInt();
			instControlador.suma(num1, num2);
			break;
			
		case 2:
			System.out.println("Ingresa el primer numero: ");
			num1=leer.nextInt();
			System.out.println("Ingresa el sedundo numero: ");
			num2=leer.nextInt();
			instControlador.resta(num1, num2);
			break;
			
		case 3: 
			System.out.println("Ingresa el primer numero: ");
			num1=leer.nextInt();
			System.out.println("Ingresa el sedundo numero: ");
			num2=leer.nextInt();
			instControlador.multiplicacion(num1, num2);
			break;
			
		case 4:
			System.out.println("Ingresa el primer numero: ");
			num1=leer.nextInt();
			System.out.println("Ingresa el sedundo numero: ");
			num2=leer.nextInt();
			instControlador.division(num1, num2);
			break;
			
			default :
				System.out.println("Elegiste una opion incorrecta");
				break;
			
		}
		
		
	}

}
