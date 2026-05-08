package calculadora;

import javax.swing.JOptionPane;

public class Calc2 {

	public static void main(String[] args) {
		
		String numero1;
		String numero2;
		String operacao = "";	
		
		try {
			
			numero1 = JOptionPane.showInputDialog("Informe o primeiro numero:");
			numero2 = JOptionPane.showInputDialog("Informe o segundo numero:");
			
			do {
				operacao = JOptionPane.showInputDialog("Informe a operação:\n" +  
						"1 - Adição (+);\n" +
						"2 - Subtração (-);\n" + 
						"3 - Multiplicação (*);\n" + 
						"4 - Divisão (/);\n");				
			} while (!operacao.equalsIgnoreCase("1") && !operacao.equalsIgnoreCase("2") &&
					!operacao.equalsIgnoreCase("3") && !operacao.equalsIgnoreCase("4"));
			
			efetuarOperacao(numero1, numero2, operacao);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void efetuarOperacao(String n1, String n2, String op) {
		int resultado = 0;
		
		try {
			switch (Integer.parseInt(op)) {
			case 1:
				resultado = Integer.parseInt(n1) + Integer.parseInt(n2);
				break;
			case 2:
				resultado = Integer.parseInt(n1) - Integer.parseInt(n2);
				break;
			case 3:
				resultado = Integer.parseInt(n1) * Integer.parseInt(n2);
				break;
			case 4:
				resultado = Integer.parseInt(n1) / Integer.parseInt(n2);
				break;}
		} catch (NullPointerException | ArithmeticException e) {
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "O resultado da operação foi: " + resultado);
		
	}
	
}
