package funcionario;

public class Vendedor extends Funcionario {

	private double totalVendasMes;
	private double comissao;
	
	public Vendedor(String nome, String setor, double salarioBase, double totalVendasMes, double comissao) {
		super(nome, setor, salarioBase);
		this.totalVendasMes = totalVendasMes;
		this.comissao = comissao;
	}

	public double getTotalVendasMes() {
		return totalVendasMes;
	}

	public void setTotalVendasMes(double totalVendasMes) {
		this.totalVendasMes = totalVendasMes;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalarioMes() {
		return super.salarioBase + this.totalVendasMes * this.comissao;
	}
	
	@Override
	public String listarDados() {
		return super.listarDados() +
				"VENDAS NO MÊS: " + this.totalVendasMes + "\n" + "COMISSÃO: " + this.comissao * 100 + "%";
	}
	
}
