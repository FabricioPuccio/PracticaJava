package accesoficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class LeyendoFichero {
	
	public void leeLetraPorLetra() {
		
		try {
			FileReader fichero = new FileReader("D:/programacion/personal-workspace/lectura-fichero-java.txt");
			/*
			 * La Clase FileReader hereda el método read() de la clase InputStreamReader.
			 * Devuelve el (int) de los caracteres unicode (char) del texto y -1 cuando llega al final
			 */
			
			int c = fichero.read();
			
			while(c != -1) {
				
				char letra = (char)c;
				
				System.out.print(letra);
				
				c = fichero.read();
			}
			
			fichero.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo NO encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void lecturaArchivo() {
		try {
			FileReader fichero = new FileReader("D:/programacion/personal-workspace/lectura-fichero-java.txt");
		/*Cuando se trata de archivos que contienen muchas líneas de código podemos trabajar con Buffers
		(memórias intermedias) que hacen al programa mas eficiente.*/
			BufferedReader miBuffer = new BufferedReader(fichero);
		
			String linea = miBuffer.readLine();
		
			while(linea != null) {
			
				System.out.println(linea);
				linea = miBuffer.readLine();
			
			}
		
		/*Cerramos el flujo de datos con el método close, no es necesario utilizar la clausula finally
		 ya que si se produciría una excepcion el flujo no se abriría.*/
			fichero.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
