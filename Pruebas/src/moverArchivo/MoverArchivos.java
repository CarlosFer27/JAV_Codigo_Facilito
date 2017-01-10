package moverArchivo;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;;

public class MoverArchivos {
	
	public void mueveArchivo(){
		File srcFile = new File("C:\\Users\\SOA\\Desktop\\Carpeta1\\prueba.txt");
		File destFile = new File("C:\\Users\\SOA\\Desktop\\Carpeta2\\"+srcFile.getName());
		
	
		try{
		FileUtils.moveFile(srcFile, destFile);
		}
		catch (IOException ex){
			System.out.println("No se encuetra archivo");
		}
		
		finally {
			System.out.println("Fin de Proceso");
		}
	}
	
	public static void main(String[] args){
		
		MoverArchivos app = new MoverArchivos();
		
		app.mueveArchivo();
		
		
	
	}
}
