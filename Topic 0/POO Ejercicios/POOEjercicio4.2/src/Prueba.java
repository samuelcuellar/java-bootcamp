public class Prueba {
	public static void main(String[] args) {
		// Using the subclasses
		Gato cat1 = new Gato();
		cat1.saludo();
		Perro dog1 = new Perro();
		dog1.saludo();
		PerroGrande bigDog1 = new PerroGrande();
		bigDog1.saludo();

		// Using Polymorphism
		Animal animal1 = new Gato();
		animal1.saludo();
		Animal animal2 = new Perro();
		animal2.saludo();
		Animal animal3 = new PerroGrande();
		animal3.saludo();
		//Animal animal4 = new Animal();

		// Downcast
		Perro dog2 = (Perro) animal2;
		PerroGrande bigDog2 = (PerroGrande) animal3;
		Perro dog3 = (Perro) animal3;
		//Gato cat2 = (Gato) animal2;
		dog2.saludo(dog3);
		dog3.saludo(dog2);
		dog2.saludo(bigDog2);
		bigDog2.saludo(dog2);
		bigDog2.saludo(bigDog1);
		
	}
}