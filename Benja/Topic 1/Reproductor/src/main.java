
public class main {

	public static void main(String[] args) {
		JFReproductor pantalla = new JFReproductor();
		Controlador c = new Controlador(pantalla);
        
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
	}

}
