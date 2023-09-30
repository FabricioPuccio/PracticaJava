package principal;

import ejercicios.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import accesoficheros.*;

public class Main {

	public static void main(String[] args) {

		System.out.println(NumeroCapicua.numeroCapicua(null)); // false
		System.out.println(NumeroCapicua.numeroCapicua(123454321));// true
		System.out.println(NumeroCapicua.numeroCapicua(-123454321));// true
		System.out.println(NumeroCapicua.numeroCapicua(2));// true
		System.out.println(NumeroCapicua.numeroCapicua(0));// true
		System.out.println(NumeroCapicua.numeroCapicua(231));// false
		System.out.println(NumeroCapicua.numeroCapicua(123));// false

		System.out.println(Caramelolandia.pricioneroDulce(0, 10, 6));// 3
		System.out.println(Caramelolandia.pricioneroDulce(7, 4, 8));// 2
		System.out.println(Caramelolandia.pricioneroDulce(1, 5, 2));// 1
		System.out.println(Caramelolandia.pricioneroDulce(0, 10, 1));// 0
		System.out.println(Caramelolandia.pricioneroDulce(455, 1585, 500));// 39
		
		
		List<String> listaMedias = new ArrayList<String>(Arrays.asList("A","B","A","B","C","A","F","Z","C","H"));
		System.out.println(UniversoParalelo.mediasAmigas(listaMedias));
		//Resultado: [A, B, C]
		listaMedias = Arrays.asList("A", "B", "C", "D", "A", "C", "D", "A");
		System.out.println(UniversoParalelo.mediasAmigas(listaMedias));
		//Resultado: [A, C, D]
		listaMedias = Arrays.asList("R", "R", "A", "A", "S", "S", "G", "H");
		System.out.println(UniversoParalelo.mediasAmigas(listaMedias));
		//Resultado: [A, R, S]
		listaMedias = Arrays.asList("R", "E", "T", "A", "P", "S", "G", "H");
		System.out.println(UniversoParalelo.mediasAmigas(listaMedias));
		//Resultado: []
		
		PracticaTecnica tec = new PracticaTecnica();
		int [] array = {11, 5, 22, 7, 8,5, 1, 2, 33, 74, 4, 3, 6, 55, 12, 11, 63, 88, 33};
		tec.metodoBurbuja(array);
		
		tec.ordenamientoInsercion(array);
		
		tec.invertirString("Texto de ejemplo 1");
		tec.invertirString2("Texto de ejemplo 2");
		
		tec.contadorLetras("cantidadcaracteres");
		
		tec.esMultiploDe2((int) (Math.random() * 100));
		
		tec.determinarBisiesto(2023);
		
		tec.desordenarCadena("ABCDEFGHIJKLMNOPQRSTVWXYZ");
		
		System.out.println("\n-----------------------------------------------------------------------------------");
		List<Integer> numList = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 2, 10, 6, 20, 6, 10));
		tec.numerosNoDuplicados(numList);
		
		tec.contieneVocal("Fabricio");
		
		EscribiendoArchivo write = new EscribiendoArchivo();
		write.crearEscribirArchivo();
		write.escribirArchivoCrado();
		
		LeyendoFichero read = new LeyendoFichero();
		read.leeLetraPorLetra();
		read.lecturaArchivo();
		
		LecturaEscrituraBytes copyIm = new LecturaEscrituraBytes();
		copyIm.lecturaEscrituraImagen();
		
		Serializacion serializing = new Serializacion();
		serializing.serializando();
		
		AccesoDirectoriosFicheros access = new AccesoDirectoriosFicheros();
		access.acceso();
		access.pruebasRutas();

	}

}
