package exemplo05.tabela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * By: Jhonatan Mattana
 * 5 de jun de 2017 - 04:56:03 
 */
public class Conexao {
	//Self se refere a está classe, "eu mesmo"
	private static Conexao self;
	
	private Connection con;
	
	private String url = "jdbc:postgresql://localhost:5432/produto";
	private String Nomebanco = "postgres";
	private String senhaBanco = "univel";
	
	public Conexao() {
		try {
			Class.forName("org.postgresql.Driver");
			this.con = DriverManager.getConnection(url,Nomebanco,senhaBanco);
		} catch (ClassNotFoundException e) {
			System.out.println("Erro no DRIVER banco.");
		} catch (SQLException e) {
			System.out.println("Erro no DriverManager.getConnection");
		}
	
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Conexao.this.con.close();
				} catch (SQLException e) {
					System.out.println("Erro em fechar a conexão.");
				}
			}
		}));
	}
	
	public final static synchronized Conexao getInstance(){
		if (self == null) {
			self = new Conexao();
		}
		return self;
	}
	
	public Connection getConection(){
		return this.con;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Só pode haver um.");
	}
	
}
