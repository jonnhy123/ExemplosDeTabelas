package exemplo05.tabela;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * By: Jhonatan Mattana
 * 5 de jun de 2017 - 05:45:41 
 */
public class ConexaoDao {

	/**
	 * 5 de jun de 2017 - 08:08:20 
	 */
	private static final String excluirItem = "DELETE FROM produto WHERE ID = ?";

	Connection con;
	
	private static final String apagarTodos = "DELETE FROM produto";
	private static final String adiconar = "INSERT INTO produto (id,nome,telefone) VALUES (?,?,?)";
	private static final String buscarTodos = "SELECT * FROM produto";

	public List<Produto> buscarTodos(){

		con = Conexao.getInstance().getConection();
		List<Produto> listaProduto = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement(buscarTodos);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Produto p = new Produto();
				p.setId(rs.getInt(1));
				p.setNome(rs.getString(2));
				p.setTelefone(rs.getString(3));
				listaProduto.add(p);
			}
		} catch (SQLException e) {
			System.out.println("Erro no SQL buscar todos.");
		}
		return listaProduto;
	}

	public void adicionar(Produto p) {
		con = Conexao.getInstance().getConection();

		try {
		    PreparedStatement ps = con.prepareStatement(adiconar);
			
			int id = p.getId();
			String nome = p.getNome();
			String telefone = p.getTelefone();
			
			ps.setInt(1, id);
			ps.setString(2, nome);
			ps.setString(3, telefone);
			
			ps.execute();
			} catch (SQLException e) {
				System.out.println("Erro no SQL adicionar.\n" + e);
			}
	}

	public void excluirItem(int intValorCampoDeTexto) {
		con = Conexao.getInstance().getConection();
		
		try {
			int id = intValorCampoDeTexto;
			PreparedStatement ps = con.prepareStatement(excluirItem);
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Erro no SQL excluirItem.\n" + e);
		}
	}

	public void apagarTodos() {
	con = Conexao.getInstance().getConection();
	
	try {
		PreparedStatement ps = con.prepareStatement(apagarTodos);
		ps.execute();
	} catch (SQLException e) {
		System.out.println("Erro no apagarTodos."+ e);
	}
	
	}

	public void speed() {
		con = Conexao.getInstance().getConection();
		List<Produto> lista = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement(adiconar);
			for (int i = 1; i <= 11; i++) {
				Produto p = new Produto();
				if (i <= 9) {
					p.setId(i);
					p.setNome("Nome_0"+i);
					p.setTelefone("(45)99123-4567");
					lista.add(p);
				}else{
					p.setId(i);
					p.setNome("Nome_"+i);
					p.setTelefone("(45)99123-4567");
					lista.add(p);
				}
			}
			
			for (int i = 0; i < lista.size(); i++) {
				int id = lista.get(i).getId();
				String nome = lista.get(i).getNome();
				String telefone = lista.get(i).getTelefone();
				
				ps.setInt(1, id);
				ps.setString(2, nome);
				ps.setString(3, telefone);
				ps.execute();
			}

		} catch (SQLException e) {
			System.out.println("Erro no speed." + e);
		}
	}
	
}
