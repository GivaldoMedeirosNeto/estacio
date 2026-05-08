package random;

import java.util.Random;

public class TesteRandom {

	public static void main(String[] args) {
		Random random = new Random();
		double numero = random.nextDouble();
		
		System.out.println("Nº gerado foi: " + numero);
		
		byte[] numeroB = new byte[10];
		random.nextBytes(numeroB);
		
		for(int i = 0; i < numeroB.length; i++) {
			System.out.println(numeroB[i]);
		}

	}

}
