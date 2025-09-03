package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno{
	
	private String rm;
	private String nome;
	private String curso;
	private String periodo;
	
	public static List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Aluno(String rm, String nome, String curso, String periodo) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.curso = curso;
		this.periodo = periodo;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	@Override
	public String toString() {
		return rm + " - " + nome + " - " + curso + " - " + periodo;
	}
	
}
