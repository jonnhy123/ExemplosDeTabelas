package exemplo02.tabela;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 * By: Jhonatan Mattana
 * 2 de jun de 2017 - 06:17:10 
 */
public class ContatoModel extends AbstractTableModel{

	private List<Pessoa> lista = new ArrayList<Pessoa>();
	private final int colunas = 6;
	
	public int getColumnCount() {
		return colunas;
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

	public int getRowCount() {
		return lista.size();
	}

	public Object getValueAt(int row, int column) {
		
		Pessoa p = lista.get(row);
		
		switch (column) {
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
		
		throw new RuntimeException("Coluna "+column+" não encontrada!!!");
	}

	public void adicionaNaTabela(Pessoa p) {
		this.lista.add(p);
		this.fireTableDataChanged();
	}

}
