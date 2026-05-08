package dado;

import java.util.Random;

import javax.swing.JOptionPane;

public class Jogada {

	public static void main(String[] args) {
		
		Random dado = new Random();
		JOptionPane.showMessageDialog(null, dado.nextInt(6) + 1);
		
	}

}
