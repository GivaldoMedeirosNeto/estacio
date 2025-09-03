package modelo;

public class Cliente {
	
	protected int codigo;
	protected String cidade;
	protected String estado;
	
	private static int quantidade;
	
	public Cliente() {
		quantidade++;
		codigo = quantidade;
		cidade = "São Paulo";
		estado = "São Paulo";
	}
	
	public Cliente(String cidade, String estado) {
		quantidade++;
		codigo = quantidade;
		this.cidade = cidade;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static int getQuantidade() {
		return quantidade;
	}

	public static void setQuantidade(int quantidade) {
		Cliente.quantidade = quantidade;
	}

	public String listarDados() {
		return  "CÓDIGO: " + codigo + "\n" +
				"CIDADE: " + cidade + "\n" +
				"ESTADO: " + estado;
	}
	
	public static int qtdClientes() {
		return quantidade;
	}

}
