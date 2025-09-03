package histograma;

import java.util.Random;

import javax.swing.JOptionPane;

public class Histograma {

	public static void main(String[] args) {
		
		int histograma[] = new int[10];
		
		Random random = new Random();
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("HISTOGRAMA\n");
		
		for(int i = 0; i < 100; i++) {
			histograma[random.nextInt(10)]++;
		}
		
		for(int i = 0; i < 10; i++) {
			stringBuilder.append((i+1) + ": ");
			for(int j = 0; j < histograma[i]; j++) {
				stringBuilder.append("# ");				
			}
			stringBuilder.append("\n");
		}
		
		JOptionPane.showMessageDialog(null, stringBuilder);
		

	}

}