package main;
import operaciones.Operaciones;
import operaciones.Ciclo;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Operaciones oper = new Operaciones();
		Ciclo ciclo = new Ciclo();
		Scanner leer = new Scanner(System.in);
		int opcion;
		int otraOperacion=1;
		
		while(otraOperacion == 1){
			System.out.println("Selecciona la operacion que quieres realizar:");
			System.out.println("1)Suma");
			System.out.println("2)Resta");
			System.out.println("3)Multiplicacion");
			System.out.println("4)Division");
			opcion=leer.nextInt();
			
			switch(opcion){
				case 1:
					oper.suma();
					otraOperacion=ciclo.otraOperacion();
					break;
				case 2:
					oper.resta();
					otraOperacion=ciclo.otraOperacion();
					break;
				case 3:
					oper.multiplicacion();
					otraOperacion=ciclo.otraOperacion();
					break;
				case 4:
					oper.division();
					otraOperacion=ciclo.otraOperacion();
					break;
				default:
					System.out.println("Seleccionaste una opcion invalida");
					otraOperacion=ciclo.otraOperacion();
					
			}
			
			System.out.println("Gracias por utilizar la calculadora");
		
			
		}
		
			
	}

}
