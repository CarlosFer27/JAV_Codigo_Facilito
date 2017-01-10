package tryCatch;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Excepcion {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		
	
		
		try {
			System.out.println("Ingresa un numero: ");
			int numero=leer.nextInt();
			
		} 	catch (Exception x){
			System.out.println("No es un numero");
			
		}
		finally {
			
			System.out.println("Adios");
		}
		
		
	}

}
