package conjutos;

import java.util.Arrays;

public class TesteArray {

	public static void main(String[] args) {
		
		int[] numeros = {1, 4, 0, -13, 2112, 14, 17};
		int posicao;
		
		System.out.println("Os elementos do array são: " + Arrays.toString(numeros));
		
		Arrays.sort(numeros);/*Ordena os elementos*/
		System.out.println("Os elementos do array ordenados são: " + Arrays.toString(numeros));
		
		posicao = Arrays.binarySearch(numeros, 14);/*Verifica a posição*/
		System.out.println("A posição do elemento '14' é " + posicao);

	}

}
