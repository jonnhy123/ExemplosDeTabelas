package exemplo03.tabela;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * By: Jhonatan Mattana
 * 2 de jun de 2017 - 07:55:15 
 */
public class ExecutaTabela extends ExecutaTabelaBase{

	public ExecutaTabela() {
		super();
		configuarBotao();
	}
	
	private void configuarBotao() {
		super.btnIniciarTabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarTabela();
			}
		});
	}

	protected void iniciarTabela() {
		PessoaModel modelo = new PessoaModel();
		tabela.setModel(modelo);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExecutaTabela frame = new ExecutaTabela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
