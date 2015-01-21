public class Demo {
	public static void main(String[] args) {
		// construir y mostrar un monoambiente
		CasaBuilder builder = new MonoAmbienteCasaBuilder();
		CasaDirector director = new CasaDirector(builder);
		director.construirCasa();
		Casa casa = director.getCasa();
		System.out.println("Casa: " + casa);

		// construir y mostrar una casa familiar
		//Builder builder = new FamiliarCasaBuilder();	
		builder = new FamiliarCasaBuilder();			//Ya no va el tipo (no se xq)
		director = new CasaDirector(builder);			//si se crea otro direcor, ej dir2, ahi si hay que poner el tipo
		director.construirCasa();
		casa = director.getCasa();
		System.out.println("Casa: " + casa);			//sobreescribo la variable casa
		
		// construir y mostrar una casa Full
		builder = new FullCasaBuilder();
		director = new CasaDirector(builder);
		director.construirCasa();
		Casa casa2 = director.getCasa();				//hago otra casa para no perderla dsp		
		System.out.println("Casa: " + casa2);	
		
		// construir y mostrar una casa Deluxe
		builder = new DeluxeCasaBuilder();
		CasaDirector director2 = new CasaDirector(builder);	
		director2.construirCasa();						
		casa = director2.getCasa();
		System.out.println("Casa: " + casa);		
		
	}
}
