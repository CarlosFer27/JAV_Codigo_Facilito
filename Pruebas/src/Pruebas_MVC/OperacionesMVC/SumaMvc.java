package Pruebas_MVC.OperacionesMVC;

public class SumaMvc {

	public int num1;
	public int num2;
	public int suma;

	public SumaMvc (int num1, int num2, int suma){
		this.num1=num1;
		this.num2=num2;
		this.suma=suma;
		suma= num1 + num2;
	}
	
	public int getNum1() {
		return num1;
	}
	
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public int getNum2() {
    	return num2;
    }
    
    public void setNum2 (int num2) {
    	this.num2 = num2;
    }
	
	public int getSuma (int suma) {
		return suma;
			
	}
}
