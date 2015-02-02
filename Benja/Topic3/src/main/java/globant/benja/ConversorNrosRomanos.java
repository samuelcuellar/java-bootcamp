package globant.benja;

public class ConversorNrosRomanos {

	public static String convertir(int n) {

		if (n < 10)
			return conversorUnidades(n);

		if (n < 100) {
			int u, d;
			u = n % 10;
			d = n / 10;
			// System.out.println("NUMERO: " + n + ", decenas: " + d +
			// ", unidades: " + u);

			return conversorDecenas(d) + conversorUnidades(u);
		}
		if (n < 1000) {
			int u, d, c;
			u = (n % 10) % 10;
			d = (n / 10) % 10;
			c = n / 100;
			// System.out.println("NUMERO: " + n + ", centenas: " + c +
			// ", decenas: " + d + ", unidades: " + u);
			return conversorCentenas(c) + conversorDecenas(d)
					+ conversorUnidades(u);
		}
		if (n < 2000) {
			int u, d, c;
			n = n % 1000;
			u = (n % 10) % 10;
			d = (n / 10) % 10;
			c = n / 100;

			// System.out.println("NUMERO: " + n + ", centenas: " + c +
			// ", decenas: " + d + ", unidades: " + u);

			return "M" + conversorCentenas(c) + conversorDecenas(d)
					+ conversorUnidades(u);
		}

		return "numero maximo: 1999";
	}

	private static String conversorCentenas(int c) {
		String[] arreglo = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC",
				"DCCC", "CM" };
		return arreglo[c];
	}

	private static String conversorDecenas(int d) {
		String[] arreglo = { "", "X", "XX", "XXX", "LX", "L", "LX", "LXX",
				"LXXX", "XC" };
		return arreglo[d];
	}

	private static String conversorUnidades(int u) {

		String[] arreglo = { "", "I", "II", "III", "IV", "V", "VI", "VII",
				"VIII", "IX" };

		return arreglo[u];
	}

	public static int convertir(String r) {
		int n = 0;
		n = n + buscadorI(r) + buscadorV(r) + buscadorX(r) + buscadorL(r) + buscadorC(r) + buscadorM(r) + buscadorD(r);
		return n;
	}

	private static int buscadorD(String r) {
		int longitud = r.length(), d = 0, peso = 500;
		char letra;
		int j;

		for (j = (longitud - 1); j > -1; j--) { // recorrer en busca de I
			letra = r.charAt(j);

			if (letra == 'D') // i a la izquierda resta
				d = d + peso;
		}
		return d;
	}

	private static int buscadorM(String r) {
		int longitud = r.length(), m = 0, peso = 1000;
		char letra;
		int j;

		for (j = (longitud - 1); j > -1; j--) { // recorrer en busca de I
			letra = r.charAt(j);

			if (letra == 'M') // i a la izquierda resta
				m = m + peso;
		}
		return m;
	}

	private static int buscadorC(String r) {
		int l = r.length(), c = 0, peso = 100;
		char letra;
		int j;
		boolean flagI = true; // la X puede restar
		for (j = (l - 1); j > -1; j--) { // recorrer en busca de I
			letra = r.charAt(j);

			if (letra == 'M' || letra == 'D') { // antes de una L o C la X resta
				flagI = false;
			}
			if (letra == 'C') {
				if (flagI)
					c = c + peso;
				else
					c = c - peso;
			}
		}
		return c;
	}

	private static int buscadorL(String r) {
		int longitud = r.length(), l = 0, peso = 50;
		char letra;
		int j;

		for (j = (longitud - 1); j > -1; j--) { // recorrer en busca de I
			letra = r.charAt(j);

			if (letra == 'L') // i a la izquierda resta
				l = l + peso;
		}
		return l;
	}

	private static int buscadorX(String r) {
		int l = r.length(), x = 0, peso = 10;
		char letra;
		int j;
		boolean flagI = true; // la X puede restar
		for (j = (l - 1); j > -1; j--) { // recorrer en busca de I
			letra = r.charAt(j);

			if (letra == 'L' || letra == 'C') { // antes de una L o C la X resta
				flagI = false;
			}
			if (letra == 'X') {
				if (flagI)
					x = x + peso;
				else
					x = x - peso;
			}
		}
		return x;
	}

	private static int buscadorV(String r) {
		int l = r.length(), v = 0, peso = 5;
		char letra;
		int j;

		for (j = (l - 1); j > -1; j--) { // recorrer en busca de I
			letra = r.charAt(j);

			if (letra == 'V') // i a la izquierda resta
				v = v + peso;
		}
		return v;
	}

	private static int buscadorI(String r) {

		int l = r.length(), i = 0;
		char c;

		int j;
		boolean flagI = true; // i++ si esta mas a la derecha
		for (j = (l - 1); j > -1; j--) { // recorrer en busca de I
			c = r.charAt(j);
			// System.out.println(c);
			if (c == 'V' || c == 'X') { // i a la izquierda resta
				flagI = false;
			}
			if (c == 'I') {
				if (flagI)
					i++;
				else
					i--;
			}
		}
		return i;
	}
}
