package temperatura;

import javax.swing.JOptionPane;

public class Temperatura {

	public static void main(String[] args) {
		
		double celsius = 0;
		double fahrenheit = 32;
		
		try {
			celsius = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Informe a temperatura em celsius: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor inválido.");
		}
		
		fahrenheit = ((celsius * 9) / 5) + 32;
		JOptionPane.showMessageDialog(null,
			celsius + "ºC = " + fahrenheit + "ºF");

	}

}
