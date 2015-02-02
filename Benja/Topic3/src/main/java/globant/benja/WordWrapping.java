package globant.benja;

public class WordWrapping {

	// private static String arreglos[];

	public static String[] wrapping(String cadena, int n) {

		int largo = cadena.length();
		float cantidadSubpalabras = (float) cadena.length() / n;
		System.out.println("cantidad dividida: " + cantidadSubpalabras);

		if (cantidadSubpalabras < 1)
			cantidadSubpalabras = 1;

		if (cantidadSubpalabras - (int) cantidadSubpalabras > 0) {
			System.out.println("se debe redondear hacia arriba: "
					+ (cantidadSubpalabras - (int) cantidadSubpalabras));
			cantidadSubpalabras = cantidadSubpalabras + 1;
			System.out.println("cant redondeada: " + cantidadSubpalabras);
		}

		int tamañoSubPalabras = n;

		String[] arreglo = new String[(int) cantidadSubpalabras];

		System.out.println("cant final: " + (int) cantidadSubpalabras);
		System.out.println("tamaño: " + tamañoSubPalabras);
		int j = 0;
		for (int i = 0; i < (int) cantidadSubpalabras; i++) {
			if (j + tamañoSubPalabras <= largo) {
				System.out.println(cadena.substring(j, j + tamañoSubPalabras));
				arreglo[i] = cadena.substring(j, j + tamañoSubPalabras);	
				j = j + tamañoSubPalabras;
			}
			else{
				arreglo[i] = cadena.substring(j, largo);	//esta funcion no sirve si se pasa
			}												//por eso hay q truncarla
		}

		return arreglo;
	}
}
