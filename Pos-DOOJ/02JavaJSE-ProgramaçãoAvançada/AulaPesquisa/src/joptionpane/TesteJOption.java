package joptionpane;

import javax.swing.JOptionPane;

public class TesteJOption {
	
	public static void main(String[] args) {
		
		String opcao = (String) JOptionPane.showInputDialog(
			null, "Escolha uma Opção", "OPÇÔES", JOptionPane.INFORMATION_MESSAGE, null,
			new String[] {"INSERIR", "SALVAR", "DELETAR"}, "SALVAR"
		);
		
		JOptionPane.showMessageDialog(null, "Confirme sua escolha.\n" + opcao);
		
	}

}
