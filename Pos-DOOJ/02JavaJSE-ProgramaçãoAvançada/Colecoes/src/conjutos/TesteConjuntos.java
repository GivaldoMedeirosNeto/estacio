package conjutos;

import java.util.HashSet;

public class TesteConjuntos {
	
	public static void main(String[] args) {
		
		HashSet<String> nomes = new HashSet<String>();
		nomes.add("Givaldo");
		nomes.add("Penelope");
		nomes.add("Twikki");
		nomes.add("Givaldo");
		
		for (String string : nomes) {
			System.out.println(string);
		}
		
	}

}
