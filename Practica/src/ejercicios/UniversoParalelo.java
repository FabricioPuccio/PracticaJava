package ejercicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class UniversoParalelo {
	
	/*
	 * En un universo paralelo, donde los habitantes son medias, existe un crucero
	 * de medias donde sube una lista de medias. Esta lista de tripulantes del crucero
	 * es una Collection de letras.
	 * 
	 * Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
	 * retornar una lista que contenga los grupos de medias que si tenían pares. Esta 
	 * lista final de medias pares se mostrarán ordenadas de menor a mayor.
	 * 
	 * A continuación un ejemplo:
	 * List de medias que llegan: A,B,A,B,C,A,F,Z,C,H. 
	 * A, B y C tienen pares, mientras que F, Z y H no.
	 * Entonces la List que se deberiá retornar sería: A,B,C.
	 */
	
	public static List<String> mediasAmigas(List<String> medias){
		
		Set<String> auxMedias = new TreeSet<String>();
		
		for(String media: medias) {
			
			int x = Collections.frequency(medias, media);
		
			if(x > 1) {
				 auxMedias.add(media);
			 }
			
		}
		
		List<String> mediasPares = new ArrayList<String>(auxMedias);
		
		return mediasPares;
	}

}
