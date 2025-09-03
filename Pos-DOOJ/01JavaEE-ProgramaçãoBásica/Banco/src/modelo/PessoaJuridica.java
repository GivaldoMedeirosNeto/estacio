package modelo;

public class PessoaJuridica extends Cliente {
	
	private String razaoSocial;
	private String cnpj;
	
	public PessoaJuridica() {}
	
	public PessoaJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String listarDados() {
		return  "RAZÃO SOCIAL: " + razaoSocial + "\n" +
				"CNPJ: " + cnpj + "\n" + 
				super.listarDados();
	}
	
	

}
