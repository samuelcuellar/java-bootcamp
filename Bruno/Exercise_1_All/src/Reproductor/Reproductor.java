package Reproductor;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;


	public class Reproductor {
		public BasicPlayer player;

    public Reproductor() {
        player = new BasicPlayer();
    }

    public void Play() throws Exception {
        player.play();
    }

    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
    }

    public void Pausa() throws Exception {
        player.pause();
    }

    public void Continuar() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }
    
    public void reproducemp3 () throws Exception{
       try {
        Reproductor   mi_reproductor = new Reproductor();
            mi_reproductor.AbrirFichero("RutaMusica.mp3");
            mi_reproductor.Play();
        }
       catch (Exception ex) {
            System.out.println("Error: ");
        }
    }
}