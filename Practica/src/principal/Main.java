package principal;

import ejercicios.NumeroCapicua;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(NumeroCapicua.numeroCapicua(null)); // false
		System.out.println(NumeroCapicua.numeroCapicua(123454321));// true
		System.out.println(NumeroCapicua.numeroCapicua(-123454321));// true
		System.out.println(NumeroCapicua.numeroCapicua(2));// true
		System.out.println(NumeroCapicua.numeroCapicua(0));// true
		System.out.println(NumeroCapicua.numeroCapicua(231));// false
		System.out.println(NumeroCapicua.numeroCapicua(123));// false

	}

}