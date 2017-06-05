package exemplo05.tabela;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * By: Jhonatan Mattana
 * 5 de jun de 2017 - 04:44:02 
 */
public class ExecutaTabela extends ExecutaTabelaBase{

	ModeloProduto meuModelo = new ModeloProduto();
	
	public ExecutaTabela() {
		super();
		configuraBotoes();
		iniciaTabela();
	}
	
	private void iniciaTabela() {
		ConexaoDao dao = new ConexaoDao();
		
		List<Produto> listaProduto = dao.buscarTodos();
		
		this.meuModelo = new ModeloProduto(listaProduto);
		
		super.tabela.setModel(meuModelo);
	}

	private void configuraBotoes() {
		btnNovo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				novo();
			}
		});
		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				salvar();
			}
		});
		btnExcluirItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				excluirItem();
			}
		});
		btnApagarTodos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				apagarTodos();
			}
		});
		btnSpeed.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				speed();
			}
		});
		
	}
	
	protected void speed() {
		ModeloProduto modelo = new ModeloProduto();
		modelo.speed();
		iniciaTabela();
	}

	protected void apagarTodos() {
		ModeloProduto modelo = new ModeloProduto();
		modelo.apagarTodos();
		iniciaTabela();
	}

	protected void excluirItem() {
		String strValorCampoDeTexto = txtId.getText().trim();
		int intValorCampoDeTexto = Integer.parseInt(strValorCampoDeTexto);
		
		ModeloProduto modelo = new ModeloProduto();
		modelo.excluirItem(intValorCampoDeTexto);
		iniciaTabela();
	}

	protected void salvar() {
		String strId = txtId.getText().trim();
		int intId = Integer.parseInt(strId);
		String nome = txtNome.getText().trim();
		String telefone = txtTelefone.getText().trim();
		
		Produto p = new Produto();
		
		p.setId(intId);
		p.setNome(nome);
		p.setTelefone(telefone);
		
		this.meuModelo.adicionar(p);
		iniciaTabela();
		
		limparCampos();
	}

	protected void novo() {
		limparCampos();
	}

	private void limparCampos() {
		txtId.setText("");
		txtNome.setText("");
		txtTelefone.setText("");
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
 