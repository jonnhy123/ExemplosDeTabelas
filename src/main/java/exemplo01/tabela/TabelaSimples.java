package exemplo01.tabela;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * By: Jhonatan Mattana
 * 2 de jun de 2017 - 05:25:55 
 */
public class TabelaSimples extends JFrame{
	JPanel painelFundo;
	JTable tabela;
	JScrollPane barraDeRolagem;
	
	Object [][] dados = {
			{"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com"},
			{"João da Silva", "48 8890-3345", "joaosilva@hotmail.com"},
			{"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com"},	
			{"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com"},
			{"João da Silva", "48 8890-3345", "joaosilva@hotmail.com"},
			{"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com"},
			{"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com"},
			{"João da Silva", "48 8890-3345", "joaosilva@hotmail.com"},
			{"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com"},	
			{"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com"},
			{"João da Silva", "48 8890-3345", "joaosilva@hotmail.com"},
			{"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com"}
	};
	
	String[] colunas = {"Nome","Telefone","E-Mail"};

	public TabelaSimples() {
		setTitle("Exemplo simples de tabela");
	}
	
	public void criarJanela(){
		painelFundo = new JPanel();
		painelFundo.setLayout(new GridLayout(1, 1));
		tabela = new JTable(dados, colunas);
		barraDeRolagem = new JScrollPane(tabela);
		painelFundo.add(barraDeRolagem);
		
		getContentPane().add(painelFundo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(550, 253);
		setVisible(true);
	}
	
}
