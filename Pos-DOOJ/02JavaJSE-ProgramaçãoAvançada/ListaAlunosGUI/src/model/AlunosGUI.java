package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import dao.AlunosDAO;

public class AlunosGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel painel;
	
	private JTextField txtRM;
	private JTextField txtNome;
	private JTextField txtCurso;
	
	private JLabel lblRM;
	private JLabel lblNome;
	private JLabel lblCurso;
	private JLabel lblPeriodo;
	
	private JList<String> lstAlunos;
	private JScrollPane scrool;
	private JComboBox<String> cmbPeriodo;
	private String[] periodo = {"MATUTINO", "VESPERTINO", "NOTURNO"};
	
	private JButton btnEnviar;
	private JButton btnListar;
	private JButton btnFechar;
	
	public AlunosGUI() {
		super("Cadastro de Alunos");
		
		painel = new JPanel();
		this.setContentPane(painel);
		painel.setLayout(null);
		this.setBounds(100, 100, 800, 210);
		
		lblRM = new JLabel("RM:");
		lblRM.setBounds(10, 20, 70, 20);
		painel.add(lblRM);
		
		txtRM = new JTextField();
		txtRM.setBounds(70, 20, 100, 20);
		painel.add(txtRM);
		
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 45, 100, 20);
		painel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(70, 45, 266, 20);
		painel.add(txtNome);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(10, 70, 100, 20);
		painel.add(lblCurso);
		
		txtCurso = new JTextField();
		txtCurso.setBounds(70, 70, 100, 20);
		painel.add(txtCurso);
		
		lblPeriodo = new JLabel("Período:");
		lblPeriodo.setBounds(175, 70, 100, 20);
		painel.add(lblPeriodo);
		
		cmbPeriodo = new JComboBox<String>(periodo);
		cmbPeriodo.setBounds(235, 70, 100, 20);
		painel.add(cmbPeriodo);
		
		scrool = new JScrollPane();
		scrool.setBounds(350, 10, 200, 150);		
		
		lstAlunos = new JList<String>();
		lstAlunos.setBounds(350, 10, 420, 150);
		scrool.setViewportView(lstAlunos);
		painel.add(lstAlunos);
		painel.add(scrool);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				try {
					Aluno aluno = new Aluno(
						txtRM.getText(),
						txtNome.getText(),
						txtCurso.getText(),
						(String) cmbPeriodo.getSelectedItem()
					);
					
					AlunosDAO dao = new AlunosDAO();
					dao.incluir(aluno);
					
					JOptionPane.showMessageDialog(null, "Aluno incluido com sucesso.");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				
				txtRM.setText("");
				txtNome.setText("");
				txtCurso.setText("");
				
			}
		});
		btnEnviar.setBounds(30, 112, 90, 25);
		painel.add(btnEnviar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				DefaultListModel<String> model = new DefaultListModel<String>();
				model.addElement("RM - NOME - CURSO - PERÍODO");
				try {
					List<Aluno> alunos = new AlunosDAO().listarAlunos();
					for (Aluno aluno : alunos) {
						model.addElement(aluno.toString());
					}
					lstAlunos.setModel(model);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
					e.printStackTrace();
				}
				
			}
		});
		btnListar.setBounds(130, 112, 90, 25);
		painel.add(btnListar);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnFechar.setBounds(230, 112, 90, 25);
		painel.add(btnFechar);
		
	}
	
}
