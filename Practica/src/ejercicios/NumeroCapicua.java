package ejercicios;

public class NumeroCapicua {

	/*
	 * Consigna: Escribir una función que reciba un número x y determine si es
	 * capicúa o no. Esta deberá devolver verdadero(true) si es capicúa y
	 * false(false) si no lo es. Además deberemos contemplar los siguientes
	 * esenarios:
	 * 
	 * Contemplar que el número que llega puede ser negativo. Contemplar que el
	 * número que llega puede ser de un digito, si es así debe devolber true.
	 * Contemplar que el número que llega puede ser null, si es así debe devolver
	 * false.
	 * 
	 */

	public static boolean numeroCapicua(Integer x) {

		boolean esCapicua = (x == null) ? false : true;

		if (esCapicua != false) {

			x = Math.abs(x);
			
			String num = String.valueOf(x);

			if (num.length() == 1)
				return true;

			for (int i = 0; i <= num.length() / 2; i++) {
				if (num.charAt(i) != num.charAt((num.length() -1)- i)) {
					return false;
				}
			}

		}

		return esCapicua;
	}
	
	public static boolean numeroCapicua2(int num) {
		String numString = String.valueOf(num);
		
		String numInv = new StringBuilder(numString).reverse().toString();
		
		if(numInv.equals(numString)) {
			return true;
		}else {
			return false;
		}
	}

}
