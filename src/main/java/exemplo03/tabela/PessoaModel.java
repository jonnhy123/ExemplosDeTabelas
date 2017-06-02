package exemplo03.tabela;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import exemplo02.tabela.Pessoa;

/**
 * By: Jhonatan Mattana
 * 2 de jun de 2017 - 17:43:48 
 */
public class PessoaModel extends AbstractTableModel{

	List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public PessoaModel() {
		for (int i = 1; i <= 10; i++) {
			Pessoa p = new Pessoa();
			p.setId(i);
			p.setIdade(i*4);
			p.setNome("Nome_"+i);
			lista.add(p);
		}
	}
	
	public int getColumnCount() {
		return 3;
	}

	public int getRowCount() {
		return lista.size();
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
		}
		
		return super.getColumnName(column);
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
		}
		throw new RuntimeException("Coluna "+column+" inválida!!!");
	}

}
