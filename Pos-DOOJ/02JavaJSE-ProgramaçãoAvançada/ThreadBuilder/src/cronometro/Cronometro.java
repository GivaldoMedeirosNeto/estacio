package cronometro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Cronometro extends JFrame {

	private JPanel contentPane;
	private JTextField txtMostrar;
	private Thread t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cronometro frame = new Cronometro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cronometro() {
		setTitle("Cronometro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				
				t = new Thread(new Runnable() {
					
					@Override
					public void run() {
						try {
							for(int i = 0; i <50; i++) {
								txtMostrar.setText(new Date().toString());
								Thread.sleep(1000);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}					
					}
				});
				
				t.start();
				
			}
		});
		btnIniciar.setBounds(49, 55, 89, 23);
		contentPane.add(btnIniciar);
		
		JButton btnParar = new JButton("Parar");
		btnParar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t != null) {
					t.stop();
				}
			}
		});
		btnParar.setBounds(165, 55, 89, 23);
		contentPane.add(btnParar);
		
		txtMostrar = new JTextField();
		txtMostrar.setBounds(49, 24, 205, 20);
		contentPane.add(txtMostrar);
		txtMostrar.setColumns(10);
	}
}
