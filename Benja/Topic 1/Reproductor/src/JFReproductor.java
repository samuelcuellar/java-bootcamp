import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class JFReproductor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public javax.swing.JButton btnPlay;
	public javax.swing.JButton btnFile;
	public javax.swing.JButton btnStop;
	public javax.swing.JButton btnPause;
	public JTextPane campoFile;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { JFReproductor frame = new
	 * JFReproductor(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public JFReproductor() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnPlay = new JButton("Play");
		btnPlay.setBounds(51, 76, 62, 23);
		contentPane.add(btnPlay);

		btnStop = new JButton("Stop");
		btnStop.setBounds(255, 76, 55, 23);
		contentPane.add(btnStop);

		btnFile = new JButton("...");
		btnFile.setBounds(278, 29, 32, 23);
		contentPane.add(btnFile);

		campoFile = new JTextPane();
		campoFile.setBounds(51, 32, 217, 20);
		contentPane.add(campoFile);

		btnPause = new JButton("Pause");
		btnPause.setBounds(152, 76, 62, 23);
		contentPane.add(btnPause);
	}
}
