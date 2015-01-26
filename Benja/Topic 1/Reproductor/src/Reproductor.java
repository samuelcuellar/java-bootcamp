import java.io.File;

import javax.swing.JFileChooser;

import javazoom.jl.player.advanced.AdvancedPlayer;

public class Reproductor {
	private AdvancedPlayer player;
	private JFileChooser seleccion;
	private File archivo;

	public Reproductor() {
		this.seleccion = new JFileChooser();
		// TODO Auto-generated constructor stub
	}

	public JFileChooser getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(JFileChooser seleccion) {
		this.seleccion = seleccion;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

	public AdvancedPlayer getPlayer() {
		return player;
	}

	public void setPlayer(AdvancedPlayer player) {
		this.player = player;
	}

}
