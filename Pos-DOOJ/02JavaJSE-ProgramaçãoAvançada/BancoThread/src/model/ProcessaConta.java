package model;

public class ProcessaConta implements Runnable {
	
	ContaCorrente conta = new ContaCorrente();
	
	private synchronized void efetuarOperacao(double valor) {
		String nome = Thread.currentThread().getName();
		
		try {
			if(conta.verificarSaldo(valor)) {
				System.out.println("Valor sacado por " + nome + ":" + valor);
				System.out.println("Saldo para " + nome + ": " + conta.efetuarSaque(valor));
			} else {
				System.out.println("Saldo Insuficiente para " + nome);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		
		try {
			for(int i =0 ; i < 10; i++) {
				Thread.sleep(2000);
				efetuarOperacao(20);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
