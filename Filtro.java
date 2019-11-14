package practicaArchivo;

import java.io.File;
import java.io.FilenameFilter;
//import java.io.IOException;

public class Filtro implements FilenameFilter{

	
	
	public boolean accept(File f, String s) {
		return s.split("[.]")[0].length() == 6;
//		return s.substring(0, s.indexOf("[.]")).length() == 6;
	}
	
}
