package funcionario;

public class Funcionario {
	
	protected String nome;
	protected String setor;
	protected double salarioBase;
	
	public Funcionario(String nome, String setor, double salarioBase) {
		super();
		this.nome = nome;
		this.setor = setor;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalarioMes() {
		return salarioBase;
	}
	
	public String listarDados() {
		return "NOME: " + this.nome + "\n" + "SETOR: " + this.setor + "\n";
	}

}
