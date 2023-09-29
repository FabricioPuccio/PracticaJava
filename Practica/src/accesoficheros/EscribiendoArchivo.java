package accesoficheros;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class EscribiendoArchivo {
	
	public void crearEscribirArchivo() {
		
		String frase = "Creamos un archivo y escribimos";
		
		File archivoNuevo = new File("D:/programacion/personal-workspace/escritura-fichero-java.txt");
		
		try {
			
			FileWriter escribir = new FileWriter(archivoNuevo);
			
			//Escribimos caracter a caracter
			for(int i = 0; i < frase.length(); i++) {
				escribir.write(frase.charAt(i));
			}
			escribir.close();
			
		}catch(IOException e) {
			System.out.println("Error al intentar crear un nuevo archivo");
			e.printStackTrace();
		}
	}
	
	public void escribirArchivoCrado() {
		
		String frase = ". Escribiendo en un archivo que ya fué creado";
		
		try {
			//Escribir en un fichero existente (ruta o nombre del archivo, true para validar que el fichero existe)
			FileWriter escribir = new FileWriter("D:/programacion/personal-workspace/escritura-fichero-java.txt", true);
			
			for(int i = 0; i < frase.length(); i++) {
				escribir.write(frase.charAt(i));
			}
			
			escribir.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
