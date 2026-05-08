package model;

public class Produto {
	
	private double preco;

	public Produto(double preco) {
		this.preco = preco;
	}
	
	public double verificarPreco() {
		return preco;
	}
	
	public void reajustarPreco(double taxa) {
		preco = preco * (1 + taxa/100);
	}
	
	public double efetuarCompra() {
		return preco;
	}

}
