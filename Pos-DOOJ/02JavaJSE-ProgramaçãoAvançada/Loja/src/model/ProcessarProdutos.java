package model;

public class ProcessarProdutos implements Runnable{
	
	Produto produto = new Produto(120);
	
	private synchronized void realizarCompra() throws Exception{
		String nome = Thread.currentThread().getName();
		
		System.out.println("Compra para: " + nome);
		System.out.println("Valor do produto: " + produto.verificarPreco());
		Thread.sleep(200);
		
		System.out.println("Reajuste de 10% para " + nome);
		produto.reajustarPreco(10);
		Thread.sleep(200);
		
		System.out.println("Novo valor para " + nome + ": " + produto.efetuarCompra());
		System.out.println("* * * * * * * * * * * * * * * * * ");
		
	}

	@Override
	public void run() {
		try {
			realizarCompra();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
