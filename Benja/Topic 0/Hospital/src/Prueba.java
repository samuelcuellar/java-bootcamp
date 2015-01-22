public class Prueba {

	public static void main(String[] args) {
		HospitalBuilder builder = new BuilderTraumatologia();
		HospitalDirector director = new HospitalDirector(builder);
		director.construirHospital();
		Hospital h = director.getHospital();
		System.out.println("Casa: " + h);
		
		System.out.println("");
		
		builder = new BuilderCardiologia();
		director = new HospitalDirector(builder);
		director.construirHospital();
		h = director.getHospital();
		System.out.println("Casa: " + h);
	}
}
