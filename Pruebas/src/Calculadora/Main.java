package Calculadora;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Operaciones oper = new Operaciones();
		PedirDatos numero = new PedirDatos();
		Scanner leer = new Scanner(System.in);
		int resultado;
		int respuesta;
		int ciclo=0;
		
		while (ciclo==0){
			
			System.out.println("Selecciona la operacion a realizar:");
			System.out.println("1)Suma");
			System.out.println("2)Resta");
			System.out.println("3)Multiplicacion");
			System.out.println("4)Division");
			
			int opcion = leer.nextInt();
			
			switch(opcion){
				case 1:  
					numero.PedirNumeros();
					resultado= oper.Suma(numero.getNum1(), numero.getNum2());
					System.out.println("La suma de "+numero.getNum1()+ " + "+numero.getNum2()+" es "+resultado);
					break;
				
				case 2:
					numero.PedirNumeros();
					resultado=oper.Resta(numero.getNum1(), numero.getNum2());
					System.out.println("La resta de "+numero.getNum1()+" - "+numero.getNum2()+" es "+resultado);
					break;
					
				case 3:
					numero.PedirNumeros();
					resultado=oper.Multiplicacion(numero.getNum1(), numero.getNum2());
					System.out.println("La multiplicacion de "+numero.getNum1()+" * "+numero.getNum2()+" es "+resultado);
					break;
					
				case 4:
					numero.PedirNumeros();
					resultado=oper.Division(numero.getNum1(), numero.getNum2());
					System.out.println("La division de "+numero.getNum1()+" / "+numero.getNum2()+" es "+resultado);
					break;
					
					default :
						System.out.println("Seleccionaste una opcion invalida");
						ciclo=0;
						break;
			}
			
			System.out.println("Quieres realizar otra operacion? 1)si 2)no");
			respuesta = leer.nextInt();
			
			if(respuesta == 1){
				ciclo=0;
			} else {
				ciclo=10;
				System.out.println("Hasta luego");
			}
			
			
		}
		

		
		
	}

}
