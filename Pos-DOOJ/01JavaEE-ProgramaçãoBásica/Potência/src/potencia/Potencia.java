package potencia;

import javax.swing.JOptionPane;

public class Potencia {

	public static void main(String[] args) {
		
		double base = 0;
		double expoente = 0;
		double resultado;
		
		try {
			base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Base:"));
			expoente = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Expoente:"));			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Valor Inválido.\nO programa será fechado."
			);
		}
		
		resultado = Math.pow(base, expoente);
		
		JOptionPane.showMessageDialog(null,
			base + " elevado a " + expoente + " é igual a " + resultado
		);

	}

}
