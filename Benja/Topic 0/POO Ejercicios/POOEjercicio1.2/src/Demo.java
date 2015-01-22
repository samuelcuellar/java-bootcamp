
public class Demo {
	public static void main(String[] args) {
		
		Autor a = new Autor("Tolkien", "JR@gmail.com", 'm');
		Libro l = new Libro("El señor de los anillos", a, 20.50);
		
		System.out.println(l);
	}
}
