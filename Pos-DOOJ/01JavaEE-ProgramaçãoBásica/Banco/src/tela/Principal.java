package tela;

import javax.swing.JOptionPane;

import modelo.Agencia;
import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class Principal {
	
	public static void main(String[] args) {
		
		Agencia agencia = new Agencia(1, "Natal - Centro");
		String opcaoPrincipal = "";
		
		do {
			
			opcaoPrincipal = JOptionPane.showInputDialog(null,
					"Cadastro de Contas para a Agência:\n(" +
					agencia.getNumero() + " - " + agencia.getNome() + ")\n" + 
					"OPÇÕES:\n" + "1 - Incluir Cliente e Conta\n" + 
					"2 - Listar Contas Cadastradas\n" + 
					"3 - Sair do Sistema"
				);
			
			if(opcaoPrincipal.equals("1")) {
				Cliente cliente;
				
				String tipoCliente = JOptionPane.showInputDialog(null,
						"Escolha o tipo de cliente:\n" + "PF - Pessoa Física\n" + "PJ - Pessoa Jurídica");
					
				if(tipoCliente.equalsIgnoreCase("PF")) {
					cliente = new PessoaFisica();
					((PessoaFisica)cliente).setNome(JOptionPane.showInputDialog(null, "Informe o Nome:"));
					((PessoaFisica)cliente).setCpf(JOptionPane.showInputDialog(null, "Informe o CPF:"));
				} else if (tipoCliente.equalsIgnoreCase("PJ")) {
					cliente = new PessoaJuridica();
					((PessoaJuridica)cliente).setRazaoSocial(JOptionPane.showInputDialog(null, "Informe a Razão Social:"));
					((PessoaJuridica)cliente).setCnpj(JOptionPane.showInputDialog(null, "Informe o CNPJ:"));
				} else {
					JOptionPane.showMessageDialog(null, "Opção Inválida! Encerrando o programa");
					return;
				}
				
				cliente.setCidade(JOptionPane.showInputDialog(null, "Informe a Cidade:"));
				cliente.setEstado(JOptionPane.showInputDialog(null, "Informe o Estado:"));
				
				JOptionPane.showMessageDialog(null, "DADOS DO CLIENTE\n\n" + cliente.listarDados());
				
				Conta conta;
				String tipoConta = JOptionPane.showInputDialog(null,
						"Tipo de conta a ser criada:\n" + "CC - Conta Corrente\nCP - Conta Poupança");
				
				if (tipoConta.equalsIgnoreCase("CP")) {
					conta = new ContaPoupanca(cliente, 10, 5);
				} else {
					conta = new ContaCorrente(cliente);
				}
				
				agencia.incluirConta(conta);
				
				JOptionPane.showMessageDialog(null, "DADOS DA CONTA\n\n" + conta.listarDados());
				
				int opcao = 0;
				String ret;
				
				do {
					
					String mensagem = "SALDO EM CONTA: " + conta.getSaldoFormatado() + "\n\n" +
						"OPÇÕES: \n1 - Depositar valor\n2 - Sacar valor\n3 - Finalizar";
					
							try {
								
								opcao = Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
								switch (opcao) {
									case 1:
										ret = JOptionPane.showInputDialog(null, "Valor do depósito:");
										conta.depositar(Double.parseDouble(ret));
										JOptionPane.showMessageDialog(null, "Depósito realizado!");
										break;
									case 2:
										ret = JOptionPane.showInputDialog(null, "Valor do saque:");
											if (conta.sacar(Double.parseDouble(ret))) {
												JOptionPane.showMessageDialog(null, "Saque realizado!");
											} else {
												JOptionPane.showMessageDialog(null, "FALHA NO SAQUE!");
											}
								}
								
							} catch (NumberFormatException ex) {
								JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO!");
							}			
				} while ((opcao == 1) || (opcao == 2));
				
			} else if (opcaoPrincipal.equals("2")) {
				if(agencia.getContas().size() == 0) {
					JOptionPane.showMessageDialog(null, "NÃO HÁ CONTAS CADASTRADAS NO MOMENTO.");
				} else {
					JOptionPane.showMessageDialog(null,
						"A Agência " + agencia.getNumero() + " - " +
						agencia.getNome() + " possui " + agencia.getContas().size() + 
						" conta(s). \n\nVeja quais são nas próximas telas"
					);
					
					for (Conta umaConta : agencia.getContas()) {
						JOptionPane.showMessageDialog(null, umaConta.listarDados());
					}
				}
			}
			
		} while ((opcaoPrincipal.equals("1")) || (opcaoPrincipal.equals("2")));
		
	}

}
