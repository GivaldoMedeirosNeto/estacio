package modelo;

public class PessoaFisica extends Cliente {
	
	private String nome;
	private String cpf;
	
	public PessoaFisica() {	}
	
	public PessoaFisica(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome.contains(" ") ? nome.substring(0, nome.indexOf(' ')) : nome;
	}

	public void setNome(String nome) {
		if(nome.isEmpty()) {
			this.nome = "NÃO INFORMADO";
		} else {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String listarDados() {
		return  "NOME: " + nome + "\n" +
				"CPF: " + cpf + "\n" + 
				super.listarDados();
	}

}
