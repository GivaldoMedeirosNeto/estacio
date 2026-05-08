package programas;

import javax.swing.JOptionPane;

public class TesteExcecoes {

	public static void main(String[] args) {
		
		try {
			String idade = JOptionPane.showInputDialog(null, "Qual a sua idade");
			int valorIdade = Integer.parseInt(idade);
			String resultado = Pessoa.exibirMaiorIdade(valorIdade);
			System.out.println("Sua idade é " + valorIdade);
			System.out.println("Você é " + resultado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
