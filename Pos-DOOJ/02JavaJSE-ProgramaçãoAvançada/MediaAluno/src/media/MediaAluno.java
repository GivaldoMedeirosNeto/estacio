package media;

import javax.swing.JOptionPane;

public class MediaAluno {

	public static void main(String[] args) {
		
		double[] notas = new double[4];
		double soma = 0;
		double media = 0;
		
		try {
			
			for(int i = 0; i < notas.length; i++) {
				do {
					notas[i] = Double.parseDouble(
						JOptionPane.showInputDialog("Informe a " + (i+1) + "º nota do aluno")
					);					
				} while(notas[i] <= 0 || notas[i] > 10);
				soma += notas[i];
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally {
			media = soma / 4;
		}
		
		JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);

	}

}
