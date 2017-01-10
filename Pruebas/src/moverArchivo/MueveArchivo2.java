package moverArchivo;
import java.nio.file.*;

public class MueveArchivo2 {
	public static void main(String[] args) throws Exception{ 
		
		Path origen = Paths.get("C:\\Users\\SOA\\Desktop\\Carpeta1\\prueba.txt");
		Path destino = Paths.get("C:\\Users\\SOA\\Desktop\\Carpeta2");
		
		Files.move(origen, destino.resolve(origen.getFileName()));
		
		
	}

}
