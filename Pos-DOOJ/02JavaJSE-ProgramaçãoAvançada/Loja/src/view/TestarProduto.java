package view;

import model.ProcessarProdutos;

public class TestarProduto {

	public static void main(String[] args) {
		
		ProcessarProdutos pp = new ProcessarProdutos();
		
		Thread t1 = new Thread(pp, "Givaldo");		
		Thread t2 = new Thread(pp, "Penelope");		
		Thread t3 = new Thread(pp, "Kira");
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
