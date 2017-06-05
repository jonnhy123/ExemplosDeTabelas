package exemplo05.tabela;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 * By: Jhonatan Mattana
 * 5 de jun de 2017 - 04:51:36 
 */
public class ModeloProduto extends AbstractTableModel{

	List<Produto> listaProduto;
	
	public ModeloProduto() {
		this(null);
	}
	
	public ModeloProduto(List<Produto> listaProdutoContrutor) {
		if (listaProdutoContrutor == null) {
			this.listaProduto = new ArrayList<Produto>();
		}else{
			this.listaProduto = listaProdutoContrutor;
		}
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return listaProduto.size();
	}

	@Override
	public String getColumnName(int coluna) {
		switch (coluna) {
		case 0:
			return "ID";
		case 1:
			return "Nome";
		case 2:
			return "Telefone";
		}
		return super.getColumnName(coluna);
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		
		Produto p = listaProduto.get(linha);
		
		switch (coluna) {
		case 0:
			return p.getId();
		case 1:
			return p.getNome();
		case 2:
			return p.getTelefone();
		}
		
		throw new RuntimeException("Coluna "+coluna+" não encontrada.");
	}

	public void adicionar(Produto p) {
		ConexaoDao dao = new ConexaoDao();
		dao.adicionar(p);
	}

	public void excluirItem(int intValorCampoDeTexto) {
		ConexaoDao dao = new ConexaoDao();
		dao.excluirItem(intValorCampoDeTexto);
	}

	public void apagarTodos() {
		ConexaoDao dao = new ConexaoDao();
		dao.apagarTodos();
	}

	public void speed() {
		ConexaoDao dao = new ConexaoDao();
		dao.speed();
	}

}
