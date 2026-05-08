package forca;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Tela {
	
	public static void main(String[] args) {
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		Forca forca = new Forca();
		
		do{
			
			textArea.setText(forca.getEstagioEnforcamento() + forca.getPalavraExibida());
			String letra = JOptionPane.showInputDialog(null, textArea);
			
			if(letra.equals("")) {
				letra = "*";
			}
			
			letra = letra.substring(0, 1).toUpperCase();
			forca.testarLetra(letra);
			
		} while ((forca.getErros() < 6) && (forca.getPalavraExibida().toString().contains("-")));
		
		String resultado;
		
		if(forca.getErros() < 6) {
			resultado = "\nVocê Descobriu a Palavra!";
		} else {
			resultado = "\nVocê foi Enforcado...";
		}
		
		textArea.setText(forca.getEstagioEnforcamento() + forca.getPalavraSorteada() + resultado);
		JOptionPane.showMessageDialog(null, textArea);
		
	}

}
