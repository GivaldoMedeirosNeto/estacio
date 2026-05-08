package model;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class EditorTexto extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel painel;

	public EditorTexto() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 400);
		
		painel = new JPanel();
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painel);
		painel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 645, 315);
		painel.add(scrollPane);
		
		final JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				JFileChooser chooser = new JFileChooser();
				
				try {
					if(chooser.showOpenDialog(EditorTexto.this) == JFileChooser.APPROVE_OPTION) {
						FileReader arquivo = new FileReader(chooser.getSelectedFile());
						String texto = "";
						
						while(true) {
							int c = arquivo.read();
							if(c == -1) {
								break;
							}
							texto += (char) c;
						}
						
						textArea.setText(texto);						
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(EditorTexto.this, e.getMessage());
				}
				
			}
		});
		
		btnAbrir.setBounds(10, 10, 80, 23);
		painel.add(btnAbrir);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				JFileChooser chooser = new JFileChooser();
				
				try {
					if(chooser.showOpenDialog(EditorTexto.this) == JFileChooser.APPROVE_OPTION) {
						FileWriter arquivo = new FileWriter(chooser.getSelectedFile());
						String texto = textArea.getText();
						
						arquivo.write(texto);
						arquivo.close();
						JOptionPane.showMessageDialog(EditorTexto.this, "Arquivo salvo com sucesso.");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(EditorTexto.this, e.getMessage());
				}
				
			}
		});
		
		btnSalvar.setBounds(100, 10, 80, 23);
		painel.add(btnSalvar);
		
	}
	
}
