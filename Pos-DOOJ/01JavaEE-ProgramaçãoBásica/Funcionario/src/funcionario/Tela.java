package funcionario;

import javax.swing.JOptionPane;

public class Tela {
	
	public static void main(String[] args) {
		
		Funcionario funcionario;		
		String tipo;
		
		do {
			tipo = JOptionPane.showInputDialog(null, "CALCULO SALÁRIO FUNCIONARIO(Vendas)\n" + 
						"OPÇÂO:\nHR - Horista;\nVE - Vendedor;");
		} while (!tipo.equalsIgnoreCase("HR") && !tipo.equalsIgnoreCase("VE"));
		
		String nome = JOptionPane.showInputDialog(null, "Informe o nome do Funcionario: ");
		String setor = JOptionPane.showInputDialog(null, "Informe o Setor do Funcionario: ");
		String base = JOptionPane.showInputDialog(null, "Informe o Salario Base: ");
		
		if(tipo.equalsIgnoreCase("HR")) {
			String horasMes = JOptionPane.showInputDialog("Quantas Horas Trabalhadas no Mês: ");
			String valorHora = JOptionPane.showInputDialog("Qual o valor por Hora: ");
			funcionario = new Horista(
				nome,
				setor,
				Double.parseDouble(base),
				Integer.parseInt(horasMes),
				Double.parseDouble(valorHora)
			);
		} else if (tipo.equalsIgnoreCase("VE")) {
			String vendas = JOptionPane.showInputDialog("Quantas Vendas efetuadas: ");
			String comissao = JOptionPane.showInputDialog("Qual a porcentagem da comissão: ");
			funcionario = new Vendedor(
				nome,
				setor,
				Double.parseDouble(base),
				Integer.parseInt(vendas),
				Double.parseDouble(comissao)/100
			);
		} else {
			funcionario = new Funcionario(
				nome,
				setor,
				Double.parseDouble(base)
			);
		}		
		
		JOptionPane.showMessageDialog(null, funcionario.listarDados() + "\n" + funcionario.calcularSalarioMes());
		
	}

}
