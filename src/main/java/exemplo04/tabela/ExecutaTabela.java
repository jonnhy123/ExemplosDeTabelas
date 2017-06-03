package exemplo04.tabela;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import exemplo02.tabela.Pessoa;

/**
 * By: Jhonatan Mattana
 * 3 de jun de 2017 - 07:58:30 
 */
public class ExecutaTabela extends ExecutaTabelaBase{
	
	private PessoaModel meuModelo = new PessoaModel();
	
	public ExecutaTabela() {
		super();
		configurarBotoes();
	}
	
	private void configurarBotoes() {
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvar();
				limparCampos();
			}
		});
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluir();
				limparCampos();
			}
		});
	}

	protected void excluir() {
		String id = txtId.getText().trim();
		int inId = Integer.parseInt(id);
		
		this.meuModelo.removerElemento(inId);
	}

	protected void salvar() {
		Pessoa p = new Pessoa();
		
		String strId = txtId.getText().trim();
		String strIdade = txtIdade.getText().trim();
		String strNome = txtNome.getText().trim();
		String strPais = txtPais.getText().trim();
		String strEstado = txtEstado.getText().trim();
		String strCidade = txtCidade.getText().trim();
		
		int intId = Integer.parseInt(strId);
		int intIdade = Integer.parseInt(strIdade);
		
		p.setId(intId);
		p.setIdade(intIdade);
		p.setNome(strNome);
		p.setPais(strPais);
		p.setEstado(strEstado);
		p.setCidade(strCidade);
		
		super.tabela.setModel(meuModelo);
		this.meuModelo.adicionar(p);
	}

	private void limparCampos() {
		txtId.setText("");
		txtIdade.setText("");
		txtNome.setText("");
		txtPais.setText("");
		txtEstado.setText("");
		txtCidade.setText("");
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
