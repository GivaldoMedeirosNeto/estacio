package modelo;

import java.util.Calendar;

public class ContaPoupanca extends Conta{
	
	private int aniversario;
	private double rendimentos;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		this.aniversario = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		this.rendimentos = 0.52;
	}
	
	public ContaPoupanca(Cliente cliente, int aniversario, double rendimento) {
		super(cliente);
		this.aniversario = aniversario;
		this.rendimentos = rendimento;
	}
		
	@Override
	public boolean sacar(double valor) {
		 int hoje = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		 
		 if ((hoje > aniversario) && (saldo >= valor)) {
			 saldo -= valor;
			 return true;
		 } else {
			 return false;
		 }
	}
		
	public void aplicarRendimentos() {
		 if (aniversario == Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) {
			 saldo = saldo + (saldo * rendimentos / 100);
		 }
	}

}
