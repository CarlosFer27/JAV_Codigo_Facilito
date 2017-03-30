package operaciones;
import java.util.Scanner;

public class Ciclo {
	Scanner leer = new Scanner(System.in);
	int ciclo;
	
	public void setCiclo(int ciclo){
		this.ciclo=ciclo;
	}
	
	public int getCiclo(){
		return ciclo;
	}
	
	public int otraOperacion(){
		System.out.println("Quieres realizar otra operacion?");
		System.out.println("1)Si");
		System.out.println("2)No");
		setCiclo(leer.nextInt());
		if(getCiclo()==1){
			return 1;
		}else{
			return 0;
		}
	}
	

}
