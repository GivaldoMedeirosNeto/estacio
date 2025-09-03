package testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import aluno.Aluno;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(new Aluno(1, "Penelope", "Analista de Sacolas"));
		alunos.add(new Aluno(2, "Kira", "Inspetora de Atividades"));
		alunos.add(new Aluno(3, "Twikki", "Inspetora de Caixas"));
		alunos.add(new Aluno(4, "Kiko", "Inspetora de Comida"));
		alunos.add(new Aluno(5, "Hynno", "Analista de Gravidade"));
		
		Collections.sort(alunos);
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("* * * * * * * * * * * * * * *");
		
		Map<Integer, String> mapAlunos = gerarMap(alunos);
		for (Map.Entry<Integer, String> aluno : mapAlunos.entrySet()) {
			System.out.println(aluno.getKey() + " - " + aluno.getValue());			
		}
		
	}
	
	private static Map<Integer, String> gerarMap(List<Aluno> alunos){
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		for(Aluno aluno : alunos) {
			mapa.put(aluno.getRm(), aluno.getNome());
		}
		return mapa;
	}

}
