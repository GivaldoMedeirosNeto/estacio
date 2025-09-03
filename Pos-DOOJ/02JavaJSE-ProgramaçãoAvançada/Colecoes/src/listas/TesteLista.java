package listas;

import java.util.ArrayList;

public class TesteLista {
	
	public static void main(String[] args) {
		ArrayList nomes = new ArrayList();
		nomes.add("Givaldo");
		nomes.add("Penelope");
		nomes.add("Kira");
		
		nomes.add(37);
		nomes.add(3);
		nomes.add(6);
		
		for(int i = 0; i < nomes.size(); i++) {
			String nome = (String) nomes.get(i);
			System.out.println(nome);
		}
		
		ArrayList<String> nomes2 = new ArrayList<String>();
		nomes2.add("Givaldo");
		nomes2.add("Penelope");
		nomes2.add("Kira");
		
		nomes2.add("37");
		nomes2.add("3");
		nomes2.add("6");
		
		for(int i = 0; i < nomes2.size(); i++) {
			String nome = nomes2.get(i);
			System.out.println(nome);
		}
		
		
	}

}
