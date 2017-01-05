package controlador;
import modelo.Modelo_Operaciones;

public class ControladorOperaciones {

	Modelo_Operaciones inst = new Modelo_Operaciones();
	
	public void suma(int num1, int num2) {
		inst.setNum1(num1);
		inst.setNum2(num2);
		inst.setResultado(inst.getNum1()+inst.getNum2());
		System.out.println("La suma de: "+inst.getNum1()+" + "+inst.getNum2()+" = "+inst.getResultado());
	}
	
	public void resta(int num1, int num2){
		inst.setNum1(num1);
		inst.setNum2(num2);
		inst.setResultado(inst.getNum1()-inst.getNum2());
		System.out.println("La resta de: "+inst.getNum1()+" - "+inst.getNum2()+" = "+inst.getResultado());
	}
	
	public void multiplicacion(int num1, int num2){
		inst.setNum1(num1);
		inst.setNum2(num2);
		inst.setResultado(inst.getNum1()*inst.getNum2());
		System.out.println("La multiplicacion de :"+inst.getNum1()+" * "+inst.getNum2()+" = "+inst.getResultado());
	}
	
	public void division(int num1, int num2){

		inst.setNum1(num1);
		inst.setNum2(num2);
		inst.setResultado(inst.getNum1()/inst.getNum2());
		if(num1==0){
			System.out.println("En una division el primer numero no puede ser cero");
		}else
		System.out.println("La division de: "+inst.getNum1()+" / "+inst.getNum2()+" = "+inst.getResultado());
	}

}
