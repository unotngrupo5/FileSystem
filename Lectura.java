package practicaArchivo;

import java.io.*;

public class Lectura {

	public static void main(String[] args) throws IOException,FileNotFoundException{
		String pathArchivo = "/Users/pablo/Desktop/POOI/Prueba.txt";
		BufferedReader br = new BufferedReader(new FileReader(pathArchivo));

		String linea = "";
		//		System.out.println(br.readLine());
		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}
		br.close();
	}

}
