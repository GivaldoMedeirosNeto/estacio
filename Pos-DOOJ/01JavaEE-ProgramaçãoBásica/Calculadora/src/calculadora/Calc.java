package calculadora;

import javax.swing.JOptionPane;

public class Calc {
	
	public static void main(String[] args) {
		
		double valor1 = 0;
		double valor2 = 0;
		double soma, sub, mult, div;
		
		try {
			valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro número:"));			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Número inválido. Considerando para número 1.");
		}
		
		try {
			valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo número:"));			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Número inválido. Considerando para número 2.");
		}

		StringBuilder resposta = new StringBuilder();
		resposta.append(valor1 + " + " + valor2 + " = " + (valor1 + valor2) + "\n");
		resposta.append(valor1 + " - " + valor2 + " = " + (valor1 - valor2) + "\n");
		resposta.append(valor1 + " * " + valor2 + " = " + (valor1 * valor2) + "\n");
		resposta.append(valor1 + " / " + valor2 + " = " + (valor1 / valor2) + "\n");	
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}

}
