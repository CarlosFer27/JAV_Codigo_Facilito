package operaciones;

public class Operaciones {
	PedirDatos datos = new PedirDatos();	

	public void suma(){
		datos.pedirDatos();
		datos.setResultado(datos.getNum1()+datos.getNum2());
		System.out.println("El resultado de "+datos.getNum1()+" + "+datos.getNum2()+" es igual a "+datos.getResultado());		
	}
	
	public void resta(){
		datos.pedirDatos();
		datos.setResultado(datos.getNum1()-datos.getNum2());
		System.out.println("El resultado de "+datos.getNum1()+" - "+datos.getNum2()+" es igual a "+datos.getResultado());
	}
	
	public void multiplicacion(){
		datos.pedirDatos();
		datos.setResultado(datos.getNum1()*datos.getNum2());
		System.out.println("El resultado de "+datos.getNum1()+" * "+datos.getNum2()+" es igual a "+datos.getResultado());
	}
	
	public void division(){
		datos.pedirDatos();
		datos.setResultado(datos.getNum1()/datos.getNum2());
		System.out.println("El resultado de dividir "+datos.getNum1()+" / "+datos.getNum2()+" es igual a "+datos.getResultado());
	}

}
