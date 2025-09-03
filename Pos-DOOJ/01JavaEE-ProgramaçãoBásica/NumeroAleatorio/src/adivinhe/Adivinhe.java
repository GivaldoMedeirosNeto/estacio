package adivinhe;

import java.util.Random;

import javax.swing.JOptionPane;

public class Adivinhe {
	
	public static void main(String[] args) {
		
		int tentativa = 0;
		int numeroSorteado;
		int palpite = 0;
		String msg;
		
		numeroSorteado = new Random().nextInt(50) + 1;
		
		msg = "Entre o número de 1 a 50, qual estou pensando?\n" +
				"(Digite 0 para desistir)";
		
		do {
			
			palpite = Integer.parseInt(JOptionPane.showInputDialog(msg));
			
			try {
				if(palpite > 0) {
					if(numeroSorteado < palpite) {
						msg = "O número que pensei é menor que este.";
					} else {
						msg = "O número que pensei é maior que este.";
					}
					tentativa++;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe somentes números e válidos!");
			}
			
		} while (palpite != 0 && palpite != numeroSorteado);
		
		String resultado = palpite == numeroSorteado ? "Acertou" : "Desistiu de Acerta";
		
		JOptionPane.showMessageDialog(null,
			"Você " + resultado + " o " + "número " + numeroSorteado + " depois de " + 
			tentativa + " tentatia(s)."
		);
		
	}

}
