package main;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int limite;
		int anterior=1;
		int impresion=0;
		int ultValor=0;
		System.out.println("Cuantas repeticiones quieres?");
		limite=leer.nextInt();
		
		for(int cont=0; cont<=limite; cont ++){
			System.out.print(impresion+" ");
			ultValor=impresion;
			impresion=anterior;
			anterior=ultValor+anterior;

		}
		
	}

}
