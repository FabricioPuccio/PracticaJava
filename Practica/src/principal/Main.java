package principal;

import ejercicios.*;

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

	}

}
