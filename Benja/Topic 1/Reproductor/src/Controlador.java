import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import org.omg.CORBA.RepositoryIdHelper;

public class Controlador implements ActionListener {

	private JFReproductor vista;
	private Reproductor reproductor;

	public Controlador(JFReproductor frame) {
		this.reproductor = new Reproductor();
		this.vista = frame;

		this.vista.btnPlay.addActionListener(this);
		this.vista.btnStop.addActionListener(this);
		this.vista.btnFile.addActionListener(this);
		this.vista.btnPause.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.btnPlay) {
			System.out.println("Play");
			try {
				reproductor.getPlayer().play();
				System.out.println("asdfasdfasdfasdf");
			} catch (JavaLayerException e1) {
				JOptionPane.showMessageDialog(null, "seleccione un archivo");
			}
		}
		if (e.getSource() == vista.btnStop) {
			reproductor.getPlayer().stop();
		}
		if (e.getSource() == vista.btnPause) {
			try {
				reproductor.getPlayer().wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == vista.btnFile) {
			System.out.println("File");
			int a = reproductor.getSeleccion().showOpenDialog(null);
			if (a == JFileChooser.APPROVE_OPTION) {
				reproductor.setArchivo(reproductor.getSeleccion()
						.getSelectedFile());
				try {
					reproductor.setPlayer(new AdvancedPlayer(
							new FileInputStream(reproductor.getArchivo())));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JavaLayerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

}