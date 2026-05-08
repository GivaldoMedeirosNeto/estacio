package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexao.SingleConnection;
import model.Aluno;

public class AlunosDAO {

	private PreparedStatement stmt;
	private Connection connection;
	private ResultSet resultSet;
	
	public AlunosDAO() {
		connection = SingleConnection.getConnection();
	}
	
	public void incluir(Aluno aluno) throws Exception {		
		String sql = "insert into alunos (RM, nome, curso, periodo) values (?, ?, ?, ?)";
		
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, aluno.getRm());
			stmt.setString(2, aluno.getNome());
			stmt.setString(3, aluno.getCurso());
			stmt.setString(4, aluno.getPeriodo());
			stmt.execute();
			connection.commit();
		} catch (Exception e) {
			throw e;
		}
		
	}

	public List<Aluno> listarAlunos ()throws Exception {
		List<Aluno> alunos = new ArrayList<Aluno>();
		String sql = "select * from alunos";
		
		try {
			stmt = connection.prepareStatement(sql);
			resultSet = stmt.executeQuery();
			
			while(resultSet.next()) {
				Aluno aluno = new Aluno(
					resultSet.getString("RM"),
					resultSet.getString("nome"),
					resultSet.getString("curso"),
					resultSet.getString("periodo")				
				);				
				alunos.add(aluno);
			}
			
		} catch (Exception e) {
			throw e;
		}
		
		return alunos;
	}
	
}
