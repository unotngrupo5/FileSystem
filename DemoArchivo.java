package practicaArchivo;
import java.io.*;

public class DemoArchivo {

	public static void main(String[] args) throws IOException{
		String path = "/Users/pablo/Desktop/POOI/";		

		File myDir = new File (path);
		File newDir = new File(path + "TEST");
		File newFile = new File(path + "Prueba3.txt");
		newDir.delete();
		if(newFile.createNewFile()) {
			System.out.println("El archivo fue creado");
		} else {
			System.out.println("El archivo ya existe");
		}  		
		if(myDir.isDirectory()) {
			for(File fhijo : myDir.listFiles(new Filtro())) {
				System.out.println(fhijo.getName());
			}
		}
	}


}
