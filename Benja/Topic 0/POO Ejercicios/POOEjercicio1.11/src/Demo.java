
public class Demo {
	public static void main(String[] args) {
		
		Autor[] autores = new Autor[3];
		autores[0] = new Autor("Booch", "JR@gmail.com", 'm');
		autores[1] = new Autor("Somerville", "JR@gmail.com", 'm');
		autores[2] = new Autor("Larman", "JR@gmail.com", 'm');
		
		Libro l = new Libro("Analisis y Diseño de Sistemas", autores, 20.50);
		
		System.out.println(l);
	}
}
