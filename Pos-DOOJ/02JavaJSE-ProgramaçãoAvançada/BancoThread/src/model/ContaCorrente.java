package model;

public class ContaCorrente {
	
	private double saldo;

	public ContaCorrente() {
		this.saldo = 200;
	}
	
	public boolean verificarSaldo(double valor) {
		return valor <= saldo;
	}
	
	public double efetuarSaque(double valor) {
		saldo -= valor;
		return saldo;
	}

}
