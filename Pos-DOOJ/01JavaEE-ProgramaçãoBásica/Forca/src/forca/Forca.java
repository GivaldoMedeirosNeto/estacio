package forca;

import java.util.Random;

public class Forca {

	private String[] palavras = new String[]{"PENELOPE", "TWIKKI", "KIKO", "RYNNO", "KIRA"} ;
	private String[] forca = new String[7];
	
	private int erros;
	private int palavraSorteada;
	private StringBuilder palavraExibida;
	
	public Forca() {
		erros = 0;
		Random random = new Random();
		palavraSorteada = random.nextInt(palavras.length);
		
		palavraExibida = new StringBuilder(palavras[palavraSorteada].replaceAll("[A-Z]", "-"));
		
		forca[0] = "-|----|\n" +
				   "      |\n" +
				   "      |\n" +
				   "      |\n" +
				   "     ===\n";
		
		forca[1] = "-|----|\n" +
				   " 0    |\n" +
				   "      |\n" +
				   "      |\n" +
				   "     ===\n";
		
		forca[2] = "-|----|\n" +
				   " 0    |\n" +
				   " |    |\n" +
				   "      |\n" +
				   "     ===\n";
		
		forca[3] = "-|----|\n" +
				   " 0    |\n" +
				   "/|    |\n" +
				   "      |\n" +
				   "     ===\n";
		
		forca[4] = "-|----|\n" +
				   " 0    |\n" +
				   "/|\\    |\n" +
				   "      |\n" +
				   "     ===\n";
		
		forca[5] = "-|----|\n" +
				   " 0    |\n" +
				   "/|\\    |\n" +
				   "/     |\n" +
				   "     ===\n";
		
		forca[6] = "-|----|\n" +
				   " 0    |\n" +
				   "/|\\    |\n" +
				   "/ \\    |\n" +
				   "     ===\n";
		
	}
	
	public String getEstagioEnforcamento() {
		return forca[erros];
	}
	
	public StringBuilder getPalavraExibida() {
		return palavraExibida;
	}
	
	public void testarLetra(String letra) {
		if(palavras[palavraSorteada].contains(letra)) {
			for(int i = 0 ; i < palavras[palavraSorteada].length(); i++) {
				if(palavras[palavraSorteada].charAt(i) == letra.charAt(0)) {
					palavraExibida.replace(i, i+1, letra);
				}
			}
		} else {
			erros++;
		}
	}
	
	public int getErros() {
		return erros;
	}
	
	public String getPalavraSorteada() {
		return palavras[palavraSorteada];
	}

}
