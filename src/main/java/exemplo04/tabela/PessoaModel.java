package exemplo04.tabela;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import exemplo02.tabela.Pessoa;

/**
 * By: Jhonatan Mattana
 * 3 de jun de 2017 - 18:27:19 
 */
public class PessoaModel extends AbstractTableModel{

	private List<Pessoa> listaPessoa;
	private final int totalColunas = 6;
	
	public PessoaModel(){
		this.listaPessoa = new ArrayList<Pessoa>();
	}
	
	public int getColumnCount() {
		return totalColunas;
	}

	public int getRowCount() {
		return listaPessoa.size();
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "ID";
		case 1:
			return "Nome";
		case 2:
			return "Idade";
		case 3:
			return "Pais";
		case 4:
			return "Estado";
		case 5:
			return "Cidade";
		}
		return super.getColumnName(column);
	}

	public Object getValueAt(int linha, int coluna) {
		
		Pessoa p = this.listaPessoa.get(linha);
		
		switch (coluna) {
		case 0:
			return p.getId();
		case 1:
			return p.getNome();
		case 2:
			return p.getIdade();
		case 3:
			return p.getPais();
		case 4:
			return p.getEstado();
		case 5:
			return p.getCidade();
		}
		
		throw new RuntimeException("Coluna "+coluna+" não existe!!!");
	}

	public void adicionar(Pessoa p) {
		this.listaPessoa.add(p);
		super.fireTableDataChanged();
	}

	public void removerElemento(Integer id) {
		for (int i = 0; i < listaPessoa.size(); i++) {
			if (listaPessoa.get(i).getId() == id) {
				listaPessoa.remove(i);
			}
		}
		super.fireTableDataChanged();
	}

}
