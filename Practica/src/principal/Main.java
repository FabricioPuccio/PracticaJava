package principal;

import ejercicios.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		/*System.out.println(NumeroCapicua.numeroCapicua(null)); // false
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
		System.out.println(Caramelolandia.pricioneroDulce(455, 1585, 500));// 39*/
		
		
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
		

	}

}
