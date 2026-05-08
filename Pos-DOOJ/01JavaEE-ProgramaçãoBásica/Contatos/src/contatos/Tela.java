package contatos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Tela {
	
	public static void main(String[] args) {
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		String nome, tel, email, opcao = null;
		
		JOptionPane.showMessageDialog(null, "Lista de Contatos");
				
		do {
			
			nome = JOptionPane.showInputDialog(null, "Informe o Nome:");
			tel = JOptionPane.showInputDialog(null, "Informe o Telefone:");
			email = JOptionPane.showInputDialog(null, "Informe o Email:");
			
			Contato contato = new Contato(nome, tel, email);
			contatos.add(contato);
			
			opcao = JOptionPane.showInputDialog(null, "Deseja Cadastrar um novo contato?\n"
						+ "S - Para continuar" + "\nQualquer tecla para sair"
					);
			
		} while (opcao.equalsIgnoreCase("S"));
		
		for (Contato contato : contatos) {
			JOptionPane.showMessageDialog(null, contato);
		}
		
	}

}
