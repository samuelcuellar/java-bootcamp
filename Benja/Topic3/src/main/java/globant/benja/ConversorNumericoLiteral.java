package globant.benja;

public class ConversorNumericoLiteral {

	public static String conversor(double d) {
		int pteEntera = (int) d;
		double centavos = (double)(d - pteEntera);
		centavos=(centavos*100);
		return conversorMillon((int) d) + " con " + (int)centavos + "/100";
	}
	
	public static String conversor(int n) {
		return conversorMillon(n);
	}	
	
	public static String conversorMillon(int n) {
		if (n <= 1000)
			return conversorMil(n);
		int m = 0;
		
		if (n > 1000 && n < 2000){
			m = n % 1000;
			return  "mil " + conversorMil(m);
		}
			
		if (n > 2000 && n < 1000000) {
			m = n % 1000;
			n = n / 1000;
			return  conversorMil(n) + " mil " + conversorMil(m);
		}
		return null;
	}

	public static String conversorMil(int n) {
		if (n <= 100)
			return conversorCien(n);
		if (n > 100 && n < 200)
			return "ciento " + conversorCien(n - 100);
		if (n > 200 && n < 300)
			return "doscientos " + conversorCien(n - 200);
		if (n > 300 && n < 400)
			return "trescientos " + conversorCien(n - 300);
		if (n > 400 && n < 500)
			return "cuatrocientos " + conversorCien(n - 400);
		if (n > 500 && n < 600)
			return "quinientos " + conversorCien(n - 500);
		if (n > 600 && n < 700)
			return "seiscientos " + conversorCien(n - 600);
		if (n > 700 && n < 800)
			return "setecientos " + conversorCien(n - 700);
		if (n > 800 && n < 900)
			return "ochocientos " + conversorCien(n - 800);
		if (n > 900 && n < 1000)
			return "novecientos " + conversorCien(n - 900);

		return conversorCentenas(n / 100);
	}

	private static String conversorCentenas(int n) {
		String array[] = { "cero", "cien", "doscientos", "trescientos",
				"cuatrocientos", "quinientos", "seiscientos", "setecientos",
				"ochocientos", "novecientos", "mil" };
		return array[n];
	}

	public static String conversorCien(int n) {
		if (n < 15)
			return conversorDirecto(n);
		if (n < 20)
			return "dieci" + conversorDirecto(n - 10);
		if (n > 20 && n < 30)
			return "veinti" + conversorDirecto(n - 20);
		if (n > 30 && n < 40)
			return "treinta y " + conversorDirecto(n - 30);
		if (n > 40 && n < 50)
			return "cuarenta y " + conversorDirecto(n - 40);
		if (n > 50 && n < 60)
			return "cincuenta y " + conversorDirecto(n - 50);
		if (n > 60 && n < 70)
			return "sesenta y " + conversorDirecto(n - 60);
		if (n > 70 && n < 80)
			return "setenta y " + conversorDirecto(n - 70);
		if (n > 80 && n < 90)
			return "ochenta y " + conversorDirecto(n - 80);
		if (n > 90 && n < 100)
			return "noventa y " + conversorDirecto(n - 90);

		return conversorDecenas(n / 10);
	}

	private static String conversorDirecto(int n) {
		String array[] = { "cero", "uno", "dos", "tres", "cuatro", "cinco",
				"seis", "siete", "ocho", "nueve", "diez", "once", "doce",
				"trece", "catorce", "quince" };
		return array[n];
	}

	private static String conversorDecenas(int n) {

		String array[] = { "cero", "diez", "veinte", "treinta", "cuarenta",
				"cincuenta", "sesenta", "setenta", "ochenta", "noventa", "cien" };
		return array[n];
	}

}
