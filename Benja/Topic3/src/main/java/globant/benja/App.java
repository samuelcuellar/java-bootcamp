package globant.benja;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(ConversorNumericoLiteral.conversor(265));
    	System.out.println(ConversorNumericoLiteral.conversor(65326.90));
    	System.out.println(ConversorNumericoLiteral.conversor(26544.24));
    	
    	System.out.println(ConversorNrosRomanos.convertir(524));
    	System.out.println(ConversorNrosRomanos.convertir(465));
    	System.out.println(ConversorNrosRomanos.convertir(1929));
    	
    	System.out.println(ConversorNrosRomanos.convertir("MCMLIX"));
    	System.out.println(ConversorNrosRomanos.convertir("CDXCII"));
    	System.out.println(ConversorNrosRomanos.convertir("MDCCI"));
    }
}
