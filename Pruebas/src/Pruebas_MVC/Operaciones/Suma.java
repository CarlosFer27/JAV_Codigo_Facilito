package Pruebas_MVC.Operaciones;

import java.util.Scanner;

public class Suma {
	
	public static void main (String [] args){

	int num1;
	int num2;
	int resultado;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Ingresa un numero: ");
	num1 = entrada.nextInt();
	
	System.out.println("Ingresa numero: ");
	num2 = entrada.nextInt();
	
	resultado = num1 + num2;
	
	System.out.println("La suma de: " +num1 + " + " +num2 + " es igual a " +resultado);
	
	entrada.close();
	
	}
	
	
}
