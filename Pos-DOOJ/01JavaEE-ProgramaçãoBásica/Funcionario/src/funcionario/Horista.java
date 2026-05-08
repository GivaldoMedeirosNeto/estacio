package funcionario;

public class Horista extends Funcionario{
	
	private int horasTrabalhadasMes;
	private double valorHora;
	
	public Horista(String nome, String setor, double salarioBase, int horasTrabalhadasMes, double valorHora) {
		super(nome, setor, salarioBase);
		this.horasTrabalhadasMes = horasTrabalhadasMes;
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadasMes() {
		return horasTrabalhadasMes;
	}

	public void setHorasTrabalhadasMes(int horasTrabalhadasMes) {
		this.horasTrabalhadasMes = horasTrabalhadasMes;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public double calcularSalarioMes() {
		return horasTrabalhadasMes * valorHora;
	}
	
	@Override
	public String listarDados() {
		return super.listarDados() + 
				"HORAS NO MÊS: " + this.horasTrabalhadasMes + "\n" + "VALOR/HORA: " + this.valorHora;
	}

}
