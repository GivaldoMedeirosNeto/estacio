package modelo;

import java.text.DecimalFormat;

public class Conta {
	
	protected int numero;
	protected Cliente cliente;
	protected double saldo;
	
	private static int contator = 1;	

	public Conta(Cliente cliente) {
		this.numero = contator++;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = contator++;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static int getContator() {
		return contator;
	}

	public static void setContator(int contator) {
		Conta.contator = contator;
	}

	public String getSaldoFormatado() {
		return DecimalFormat.getCurrencyInstance().format(saldo);
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public String listarDados() {
		String nome;
		if(cliente instanceof PessoaFisica) {
			nome = ((PessoaFisica)cliente).getNome();
		} else {
			nome = ((PessoaJuridica)cliente).getRazaoSocial();
		}
		
		return "NUMERO: " + numero + "\n" + 
				"CORRENTISTA: " + nome + "\n" + 
				"SALDO: " + DecimalFormat.getCurrencyInstance().format(saldo);
	}

}
