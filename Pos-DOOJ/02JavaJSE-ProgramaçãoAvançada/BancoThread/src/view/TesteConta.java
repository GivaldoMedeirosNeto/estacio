package view;

import model.ProcessaConta;

public class TesteConta {

	public static void main(String[] args) {
		
		ProcessaConta pc = new ProcessaConta();
		Thread t1 = new Thread(pc, "Givaldo");
		Thread t2 = new Thread(pc, "Mayara");
		
		try {
			t1.start();
			t2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
