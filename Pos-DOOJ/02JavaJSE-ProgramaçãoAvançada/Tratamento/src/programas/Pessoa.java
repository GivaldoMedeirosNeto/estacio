package programas;

public class Pessoa {
	
	public static String exibirMaiorIdade(int idade) {
		
		if(idade <=0) {
			throw new IllegalArgumentException("A idade não pode ser negativa");
		} else if(idade < 18) {
			return "Menor de idade";
		} else {
			return "Maior de idade";
		}
	}

}
