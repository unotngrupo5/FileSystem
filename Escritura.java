package practicaArchivo;

import java.io.*;

public class Escritura {

	public static void main(String[] args) throws IOException{
		String pathArchivo = "/Users/pablo/Desktop/POOI/Prueba.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(pathArchivo));

		bw.write("Hola Campeón");
		bw.newLine();
		bw.write("Chau Campeón");
		bw.close();
	}

}
